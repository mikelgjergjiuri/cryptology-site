class Des {

    constructor(){
        this.encoding = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789. ";
        this.sboxArrays = [
            [
                ["101", "010", "001", "110", "011", "100", "111", "000"],
                ["001", "100", "110", "010", "000", "111", "101", "011"]
            ],
            [
                ["100", "000", "110", "101", "111", "001", "011", "010"],
                ["101", "011", "000", "111", "110", "010", "001", "100"]
            ]
        ]
        this.keyLength = 9;
        this.pause = false;
    }

    async log(message){
        document.getElementById("encryption-log").innerHTML += message + '\n\n';
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
        var lines = document.querySelectorAll('[id^="line"]');
        for(var i = 0; i < lines.length; i++){
            lines[i].style.stroke = "rgb(0,0,0)";
        }
        var sboxes = document.querySelectorAll('[id^="sbox-value"]');
        for(var i = 0; i < sboxes.length; i++){
            if(sboxes[i].innerHTML.length > 3){
                sboxes[i].innerHTML = sboxes[i].innerHTML.slice(3,6);
            }
        }
        var preBits = document.querySelectorAll('[id^="pre-expander"]');
        var postBits = document.querySelectorAll('[id^="post-expander"]');
        var xoredKeyBits = document.querySelectorAll('[id^="xored-key-bit"]');
        for(var i = 0; i < postBits.length; i++){
            postBits[i].innerHTML = "";
            xoredKeyBits[i].innerHTML = "";
        }
        for(var i = 0; i < preBits.length; i++){
            preBits[i].innerHTML = "";
        }
    }

    async expander(string){
        
        var expandedString = string.slice(0,2) + string[3] + string[2] + string[3] + string[2] + string.slice(4,6);
        
        var preExpandedBits = document.querySelectorAll('[id^="pre-expander"]'); 
        var postExpandedBits = document.querySelectorAll('[id^="post-expander"]'); 
        var lines = document.querySelectorAll('[id^="line-expander"]');
       
        for(var i = 0; i < preExpandedBits.length; i++){
            preExpandedBits[i].innerHTML = string[i];
        }

        for(var i = 0; i < lines.length; i++){
            await this.sleep();
            lines[i].style.stroke = "rgb(255,0,0)";
            postExpandedBits[i].innerHTML = expandedString[i];
        }
        await this.log("Expanded " + string + " to " + expandedString);
        return expandedString;
    }

    async xor(bits1, bits2){
        var xored = "";
        for(var i = 0; i < bits1.length; i++){
            if (bits1[i] != bits2[i]){
                xored += "1";
            }
            else{
                xored += "0";
            }
        }
        await this.log("Exclusive OR on " + bits1 + " and " + bits2);
        return xored;
    }

    async charToBits(character){
        var binaryString = this.encoding.indexOf(character).toString(2);
        while(binaryString.length < 6){
            binaryString = "0" + binaryString;
        }
        return binaryString;
    }

    async sbox(bits, sboxIndex){
        var arrayIndex = parseInt(bits[0], 2);
        var index = parseInt(bits.slice(1,4), 2);
        var output = this.sboxArrays[sboxIndex][arrayIndex][index];

        await this.log("Using row " + arrayIndex + ", column " + index + " on sbox " + sboxIndex + " to retrieve " + output);
        document.getElementById("sbox-value-" + sboxIndex + "-" + arrayIndex + "-" + index).innerHTML = "<b>" + document.getElementById("sbox-value-" + sboxIndex + "-" + arrayIndex + "-" + index).innerHTML + "</b>";

        return output;
    }

    async encryptFunction(right, key){
        document.getElementById("line-function-opening").style.stroke = "rgb(255,0,0)";
        var expandedRight = await this.expander(right);
        var xored = await this.xor(expandedRight, key);
        
        var linesFunctionalXor = document.querySelectorAll('[id^="line-functional-xor"]');

        // color lines red showing that we are xoring the key with the expanded bits
        for(var i = 0; i < linesFunctionalXor.length; i++){
            await this.sleep();
            linesFunctionalXor[i].style.stroke = "rgb(255,0,0)";
        }
        // show key in html
        document.getElementById("key-box").innerHTML = key;
        var xoredBits = document.querySelectorAll('[id^="xored-key-bit"]');

        // show bits after they have been xored
        for(var i = 0; i < xoredBits.length; i++){
            await this.sleep();
            xoredBits[i].innerHTML = xored[i];
        }

        var linesSboxSplit1 = document.querySelectorAll('[id^="line-sbox-split-1"]');
        var linesSboxSplit2 = document.querySelectorAll('[id^="line-sbox-split-2"]');
        for(var i = 0; i < linesSboxSplit1.length; i++){
            await this.sleep();
            linesSboxSplit1[i].style.stroke = "rgb(255,0,0)";
            linesSboxSplit2[i].style.stroke = "rgb(255,0,0)";
        }

        document.getElementById("xorsplit1").innerHTML= xored.slice(0, 4);
        document.getElementById("xorsplit2").innerHTML= xored.slice(4, 8);
        await this.sleep();
        document.getElementById("line-sbox-index-1").style.stroke = "rgb(255,0,0)";
        document.getElementById("line-sbox-index-2").style.stroke = "rgb(255,0,0)";

        var bits1 = await this.sbox(xored.slice(0, 4), 0);
        await this.sleep();
        var bits2 = await this.sbox(xored.slice(4,8), 1);

        await this.sleep();
        var linesSboxConcatenation = document.querySelectorAll('[id^="line-sbox-concatenation"]');
        for(var i = 0; i < linesSboxConcatenation.length; i++){
            await this.sleep();
            linesSboxConcatenation[i].style.stroke = "rgb(255,0,0)";
        }

        document.getElementById("function-output").innerHTML = bits1 + bits2;
        return bits1 + bits2;
    }

    async encrypt(characterPair, key){
        await this.resetGraphics();

        var left = await this.charToBits(characterPair[0]);
        document.getElementById("encoding-1").innerHTML = characterPair[0] + ": " + left;
        document.getElementById("li-1").innerHTML = left;

        var right = await this.charToBits(characterPair[1]);
        document.getElementById("encoding-2").innerHTML = characterPair[1] + ": " + right;
        document.getElementById("ri-1").innerHTML = right;

        document.getElementById("line-ri-1-func").style.stroke = "rgb(255,0,0)";
        await this.sleep();
        var functionOutput = await this.encryptFunction(right, key);
        document.getElementById("line-function-return-1").style.stroke = "rgb(255,0,0)";
        document.getElementById("line-function-return-2").style.stroke = "rgb(255,0,0)";
        await this.sleep();
        document.getElementById("line-li-1-xor").style.stroke = "rgb(255,0,0)";
        var rightOut = this.encoding[parseInt(await this.xor(functionOutput, left), 2)];
        await this.sleep();
        document.getElementById("line-xor-ri").style.stroke = "rgb(255,0,0)";
        document.getElementById("ri").innerHTML = rightOut;

        var leftOut = this.encoding[parseInt(right, 2)];
        await this.sleep();
        document.getElementById("line-ri-1-li").style.stroke = "rgb(255,0,0)";
        document.getElementById("li").innerHTML = leftOut;
        await this.sleep();
        return leftOut + rightOut;
    }

    async keySubstring(index, key){
        var keyPosition = key.length % index;
        if(keyPosition + this.keyLength <= key.length){
            var keySegment = key.substr(keyPosition, this.keyLength);
        }
        else{
            var keyPart = key.slice(keyPosition);
            var keySegment = keyPart + key.substr(0, this.keyLength - keyPart.length);
        }
        await this.log("Using key " + keySegment + " from " + key + " for round " + index);
        return keySegment;
    }

    async encryptRounds(characterPair, rounds, key){
        if(rounds <= 0) return characterPair; // sanity check
        for(var i = 0; i < rounds; i++){
            var keySegment = await this.keySubstring(i, key);
            characterPair = await this.encrypt(characterPair, keySegment);
        }
        return characterPair;
    }

    async decryptRounds(characterPair, rounds, key){
        if(rounds <= 0) return characterPair; // sanity check
        characterPair = characterPair[1] + characterPair[0];
        await this.log("Flipping '" + characterPair + "'");
        for(var i = rounds-1; i >= 0; i--){
            var keySegment = await this.keySubstring(i, key);
            characterPair = await this.encrypt(characterPair, keySegment);
            console.log(characterPair);
        }
        characterPair = characterPair[1] + characterPair[0];
        await this.log("Flipping '" + characterPair + "'");

        return characterPair;
    }

}

var des = new Des();

function pauseFunction(){

    var playOrPause = document.getElementById("pause-button").innerHTML;

    if(playOrPause == "Pause"){
        des.pause = true;
        document.getElementById("pause-button").innerHTML = "Resume";
    }

    else{
        des.pause = false;
        document.getElementById("pause-button").innerHTML = "Pause";
    }
}

async function encryptFunction(){
    var userInput = document.getElementById("input-text");
    document.getElementById("encryption-log").innerHTML = "";
    document.getElementById("output-text").innerHTML = "";

    if((userInput.value.length % 2) == 1){
        userInput.value += " ";
    }

    var key = document.getElementById("key-input").value;
    var rounds = parseInt(document.getElementById("round-input").value, 10);

    while(userInput.value != ""){
        var userInputString = userInput.value.slice(0,2);
        userInput.value = userInput.value.slice(2);
        document.getElementById("output-text").innerHTML += await des.encryptRounds(userInputString, rounds, key);
    }
}

async function decryptFunction(){
    var userInput = document.getElementById("input-text");
    document.getElementById("encryption-log").innerHTML = "";
    document.getElementById("output-text").innerHTML = "";

    if((userInput.value.length % 2) == 1){
        userInput.value += " ";
    }

    var key = document.getElementById("key-input").value;
    var rounds = parseInt(document.getElementById("round-input").value, 10);

    while(userInput.value != ""){
        var userInputString = userInput.value.slice(0,2);
        userInput.value = userInput.value.slice(2);
        document.getElementById("output-text").innerHTML += await des.decryptRounds(userInputString, rounds, key);
    }
}

document.getElementById("pause-button").addEventListener("click", pauseFunction);
document.getElementById("encrypt-button").addEventListener("click", encryptFunction);
document.getElementById("decrypt-button").addEventListener("click", decryptFunction);
