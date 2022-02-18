class Hash {

    constructor(){
        this.encoding = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789. ";
        this.pause = false;
        this.reds = ["254,152,203", "254,152,203", "254,102,102", "254,102,102", "254,0,0", "254,0,0"];
        this.oranges = ["254,203,0", "254, 203, 0", "254,152,0", "254,152,0", "224,141,60", "224,141,60"];
        this.greens = ["0,254,0", "0,254,0", "51,152,102", "51,152,102", "0,128,0", "0,128,0"];
        this.blues = ["0,254,254", "0,254,254", "0,0,254", "0,0,254", "120,81,169", "120,81,169"];
        this.colors = [this.reds, this.oranges, this.greens, this.blues];
    }

    async log(message){
        document.getElementById("encryption-log").innerHTML += message + '\n\n';
    }
    
    async charToBits(character){
        var binaryString = this.encoding.indexOf(character).toString(2);
        while(binaryString.length < 6){
            binaryString = "0" + binaryString;
        }
        return binaryString;
    }

    async pauseSleep(){
        return new Promise(resolve => setTimeout(resolve,100));
    }

    async sleep(){
        var delayString = document.getElementById("delay-slider").value;
        var delay = parseInt(delayString, 10);
        while(this.pause){
            await this.pauseSleep();
        }
        return new Promise(resolve => setTimeout(resolve,delay));
    }
    
    async resetGraphics(){
        document.getElementById('arrows').innerHTML = "";
        
        var bits = document.querySelectorAll('[id*="-bit-"]');
        for(var i = 0; i < bits.length; i++){
            bits[i].innerHTML = "";
            bits[i].style.color = "rgb(0,0,0)";
        }
        
        var labels = document.querySelectorAll('[id*="-label-"]');
        for(var i = 0; i < labels.length; i++){
            labels[i].innerHTML = "";
        } 
    }

    async drawBit(topPosition, leftPosition, name, column, bitNumber){
        var bit = document.createElement("div");
        bit.setAttribute("id", name + "-" + column + "-bit-" + bitNumber);
        bit.setAttribute("class", "bit");
        bit.style.top = topPosition+"px";
        bit.style.left = leftPosition+"px";
        bit.style.position = 'absolute';
        var mainBox = document.getElementById("mainhashbox");
        mainBox.appendChild(bit);
    }
    
    async drawBitLabel(topPosition, leftPosition, name, column){
        var bit = document.createElement("div");
        bit.setAttribute("id", name + "-label-" + column);
        bit.setAttribute("class", "bit_label");
        bit.style.top = topPosition+"px";
        bit.style.left = leftPosition+"px";
        bit.style.position = 'absolute';
        var mainBox = document.getElementById("mainhashbox");
        mainBox.appendChild(bit);
    }

    async drawBits(){
        var names = ["prior", "char", "xored", "combined", "output"];
        var topStart = 12;
        var leftStart = 12;
        for(var i = 1; i <= names.length; i++){
            for(var j = 1; j <= 4; j++){
                this.drawBitLabel(topStart + 70*(i-1), leftStart + (j-1)*205, names[i-1], j);
                for(var k = 1; k <= 6; k++){
                    this.drawBit(topStart + 70*(i-1), leftStart + 40 + (j-1)*205 + (k-1)*20, names[i-1], j, k);
                }
            }
        }
    }

    async drawLineToBit(top_bit, bottom_bit, svg, index, bit_position){
        var xorLine = document.createElementNS('http://www.w3.org/2000/svg', 'line');
        xorLine.setAttribute('id', 'prior-' + index + '-line-' + bit_position);
        xorLine.setAttribute('x1', top_bit.offsetLeft + 10);
        xorLine.setAttribute('x2', bottom_bit.offsetLeft + 10);
        xorLine.setAttribute('y1', top_bit.offsetTop + 20);
        xorLine.setAttribute('y2', bottom_bit.offsetTop);
        xorLine.setAttribute("stroke", "black");
        xorLine.setAttribute("stroke-width", "1.5");
        svg.appendChild(xorLine);
        await this.sleep()
    }

    async xor(index, permutation){
        
        var returnValue = ["","","","","",""];
        var bits1 = await this.charToBits(document.getElementById("prior-label-" + index).innerHTML[1]);
        var bits2 = await this.charToBits(document.getElementById("char-label-" + index).innerHTML[1]);
        
        for(var bit = 1; bit <= bits1.length; bit++){
            var prior = document.getElementById("prior-" + index + "-bit-" + bit);
            var ch = document.getElementById("char-" + index + "-bit-" + bit);
            prior.innerHTML = bits1[bit-1];
            ch.innerHTML = bits2[bit-1];
            this.sleep()
        }

        for(var bit = 1; bit <= bits1.length; bit++){
            
            // get bits we are xoring
            var prior = document.getElementById("prior-" + index + "-bit-" + bit);
            var ch = document.getElementById("char-" + index + "-bit-" + bit);
            // get bit we are storing (permuted)
            var xor = document.getElementById("xored-" + index + "-bit-" + permutation[bit-1]);
            
            // get svg to draw lines dynamically
            var svg = document.getElementById("arrows");
            
            await this.drawLineToBit(prior, ch, svg, index, bit);

            await this.drawLineToBit(ch, xor, svg, index, bit);
            if(prior.innerHTML != ch.innerHTML){
                xor.innerHTML = "1";
                returnValue[permutation[bit-1]] = "1";
            }
            else{
                xor.innerHTML = "0";
                returnValue[permutation[bit-1]] = "0";
            }
        }
        await this.log("XORed " + bits1 + " and " + bits2 + " using permutation " + permutation.toString());
        return this.encoding[parseInt(returnValue.join(""), 2)];
    }

    async interlinkXor(index){
        var bits = "";
        var grabbing_from = (index % 4) + 1;
        var move_to_next = false;
        for(var i = 1; i <= 6; i++){
            var destination_bit = document.getElementById("combined-" + index + "-bit-" + i);
            var source_bit = document.getElementById("xored-" + grabbing_from + "-bit-" + i);
            var color_of_source_bit = this.colors[grabbing_from - 1][i-1];
            destination_bit.style.color = "rgb(" + color_of_source_bit + ")";
            destination_bit.style.position = 'absolute';
            destination_bit.innerHTML = source_bit.innerHTML;
            bits += source_bit.innerHTML[3];
            this.sleep();
            if(move_to_next){
                grabbing_from = (grabbing_from % 4) + 1;
                move_to_next = false;
            }
            else{
                move_to_next = true;
            }
        }
        
        document.getElementById("combined-label-" + index).innerHTML = '"' + this.encoding[parseInt(bits, 2)] + '"';
        
        var bits1 = await this.charToBits(document.getElementById("xored-label-" + index).innerHTML[1]);
        var bits2 = await this.charToBits(document.getElementById("combined-label-" + index).innerHTML[1]);

        var returnValue = ["","","","","",""];

        for(var bit = 1; bit <= bits1.length; bit++){
            
            // get bits we are xoring
            var prior = document.getElementById("xored-" + index + "-bit-" + bit);
            var ch = document.getElementById("combined-" + index + "-bit-" + bit);
            var xor = document.getElementById("output-" + index + "-bit-" + bit);
            
            // get svg to draw lines dynamically
            var svg = document.getElementById("arrows");
            
            await this.drawLineToBit(prior, ch, svg, index, bit);

            await this.drawLineToBit(ch, xor, svg, index, bit);

            if(prior.innerHTML != ch.innerHTML){
                xor.innerHTML = "1";
                returnValue[bit-1] = "1";
            }
            else{
                xor.innerHTML = "0";
                returnValue[bit-1] = "0";
            }
        }

        await this.log("XORed " + bits1 + " and " + bits2); 

        var returnChar = this.encoding[parseInt(returnValue.join(""), 2)];

        document.getElementById("output-label-" + index).innerHTML = '"' + returnChar + '"';

        for(var i = 0; i < 12; i++) await this.sleep();

        return returnChar;
    }

    async colorBits(){
        for(var i = 1; i <= 4; i++){
            for(var j = 1; j <= 6; j++){
                var bit = document.getElementById("xored-" + i + "-bit-" + j);
                bit.innerHTML = "<b>" + bit.innerHTML + "</b>";
                bit.style.color = "rgb(" + this.colors[i-1][j-1] + ")";
                await this.sleep();
            }
        }
    }

    async visualization(permutations, initial_value, userInputString){
        var xoredString = "";
        for(var i = 0; i < permutations.length; i++){
            document.getElementById("prior-label-" + (i+1)).innerHTML = '"' + initial_value[i] + '"';
            document.getElementById("char-label-" + (i+1)).innerHTML = '"' + userInputString[i] + '"';
            var xored = await this.xor(i+1, permutations[i]);
            document.getElementById("xored-label-" + (i+1)).innerHTML = '"' + xored + '"';
            await this.sleep();
            xoredString += xored;
        }
        
        await this.colorBits();

        var returnString = "";

        for(var i = 1; i <= 4; i++){
            var returnValue = await this.interlinkXor(i);
            returnString += returnValue;
        }


        await this.resetGraphics();

        return returnString;
        
    }

}

var hasher = new Hash();

hasher.drawBits();

function pauseFunction(){

    var playOrPause = document.getElementById("pause-button").innerHTML;

    if(playOrPause == "Pause"){
        hasher.pause = true;
        document.getElementById("pause-button").innerHTML = "Resume";
    }

    else{
        hasher.pause = false;
        document.getElementById("pause-button").innerHTML = "Pause";
    }
}

async function hashFunction(){
    var userInput = document.getElementById("input-text");
    document.getElementById("encryption-log").innerHTML = "";
    document.getElementById("output-text").innerHTML = "";

    while(!((userInput.value.length % 4) == 0)){
        userInput.value += " ";
    }

    var initial_value = document.getElementById("key-input").value;

    var permutations = ["463512", "132465", "653124", "361245"];
    for (var i = 0; i < 4; i++){
        permutations[i] = document.getElementById("permutation-" + (i+1)).value;
    }
    
    while(userInput.value != ""){
        var userInputString = userInput.value.slice(0,4);
        userInput.value = userInput.value.slice(4);
        initial_value = await hasher.visualization(permutations, initial_value, userInputString);
    }

    document.getElementById("output-text").innerHTML = initial_value;

}

document.getElementById("pause-button").addEventListener("click", pauseFunction);
document.getElementById("hash-button").addEventListener("click", hashFunction);
