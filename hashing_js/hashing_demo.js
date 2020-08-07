class Hash {

    constructor(){
        this.encoding = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789. ";
        this.pause = false;
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
        
        var returnValue = "";
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
                returnValue += "1";
            }
            else{
                xor.innerHTML = "0";
                returnValue += "0";
            }
        }
        await this.log("XORed " + bits1 + " and " + bits2 + " using permutation " + permutation.toString());
        return this.encoding[parseInt(returnValue, 2)];
    }

    async visualization(permutations, initial_value, userInputString){
        var returnString = ""
        for(var i = 0; i < permutations.length; i++){
            document.getElementById("prior-label-" + (i+1)).innerHTML = '"' + initial_value[i] + '"';
            document.getElementById("char-label-" + (i+1)).innerHTML = '"' + userInputString[i] + '"';
            var result = await this.xor(i+1, permutations[i]);
            document.getElementById("xored-label-" + (i+1)).innerHTML = '"' + result + '"';
            await this.sleep();
            returnString += result;
        }

        await this.resetGraphics();

        return returnString;
        
    }

}

var hasher = new Hash();

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
