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
		this.mathJax = {"li-1": document.getElementById("li-1").innerHTML,
						"ri-1": document.getElementById("ri-1").innerHTML,
						"ri": document.getElementById("ri").innerHTML,
						"li": document.getElementById("li").innerHTML,
						"key-box": document.getElementById("key-box").innerHTML
						}
		
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
		document.getElementById("function-output").innerHTML = "";
		document.getElementById("xorsplit1").innerHTML = "";
		document.getElementById("xorsplit2").innerHTML = "";
		document.getElementById("ri-1").innerHTML = this.mathJax["ri-1"];
		document.getElementById("li-1").innerHTML = this.mathJax["li-1"];
		document.getElementById("li").innerHTML = this.mathJax["li"];
		document.getElementById("ri").innerHTML = this.mathJax["ri"];
		document.getElementById("key-box").innerHTML = this.mathJax["key-box"];
        MathJax.typeset();
		
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
        
        return xored;
    }

    async charToBits(character){
        var binaryString = this.encoding.indexOf(character).toString(2);
        while(binaryString.length < 6){
            binaryString = "0" + binaryString;
        }
        return binaryString;
    }

    async bitsToChar(bits){
	    return this.encoding[parseInt(bits, 2)];
    }

    async sbox(bits, sboxIndex){
        var arrayIndex = parseInt(bits[0], 2);
        var index = parseInt(bits.slice(1,4), 2);
        var output = this.sboxArrays[sboxIndex][arrayIndex][index];

        await this.log("Using row " + arrayIndex + ", column " + index + " on sbox " + (sboxIndex+1) + " to retrieve " + output);
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

		await this.log("XOR Expanded Bits " + expandedRight + " with Key " + key);
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
        document.getElementById("li-1").innerHTML = characterPair[0] + ": " + left;

        var right = await this.charToBits(characterPair[1]);
        document.getElementById("encoding-2").innerHTML = characterPair[1] + ": " + right;
        document.getElementById("ri-1").innerHTML = characterPair[1] + ": " + right;

        document.getElementById("line-ri-1-func").style.stroke = "rgb(255,0,0)";
        await this.sleep();
        var functionOutput = await this.encryptFunction(right, key);
        document.getElementById("line-function-return-1").style.stroke = "rgb(255,0,0)";
        document.getElementById("line-function-return-2").style.stroke = "rgb(255,0,0)";
        await this.sleep();
        document.getElementById("line-li-1-xor").style.stroke = "rgb(255,0,0)";
	var xoredFunctionOutputWithLeft = await this.xor(functionOutput, left);
	await this.log("XOR Function Output " + functionOutput + " with Left Input " + left);
        var rightOut = this.encoding[parseInt(xoredFunctionOutputWithLeft, 2)];
        await this.sleep();
        document.getElementById("line-xor-ri").style.stroke = "rgb(255,0,0)";
        document.getElementById("ri").innerHTML = rightOut + ": " + xoredFunctionOutputWithLeft;

        var leftOut = this.encoding[parseInt(right, 2)];
        await this.sleep();
        document.getElementById("line-ri-1-li").style.stroke = "rgb(255,0,0)";
        document.getElementById("li").innerHTML = leftOut + ": " + right;
        await this.sleep();
        return leftOut + rightOut;
    }

    async keySubstring(index, key){
        var keySegment = [];
        for (var i = index; i < (key.length - 1 + index); i++){
            var idx = i % key.length;
            keySegment.push(key[idx]);
        }
        keySegment = keySegment.join("");
        await this.log("Using key " + keySegment + " from " + key + " for round " + index);
        return keySegment;
    }

    async encryptRounds(characterPair, rounds, key){
        if(rounds <= 0) return characterPair; // sanity check
        for(var i = 0; i < rounds; i++){
	    await this.log("Round Input: " + characterPair);
            var keySegment = await this.keySubstring(i, key);
            console.log(keySegment);
            characterPair = await this.encrypt(characterPair, keySegment);
	    await this.log("Round Output: " + characterPair);
        }
        await this.log("Flipping '" + characterPair + "'");
        return characterPair[1] + characterPair[0];
    }

    async decryptRounds(characterPair, rounds, key){
        if(rounds <= 0) return characterPair; // sanity check
        for(var i = rounds-1; i >= 0; i--){
            await this.log("Round Input: " + characterPair);
            var keySegment = await this.keySubstring(i, key);
            console.log(keySegment);
            characterPair = await this.encrypt(characterPair, keySegment);
	    await this.log("Round Output: " + characterPair);
        }
        await this.log("Flipping '" + characterPair + "'");
        
        return characterPair[1] + characterPair[0];
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

	if (key.length != 9){
		window.alert("ERROR: Key must be of length 9");
		return;
	}
	else if(!verifyKey(key)){
		window.alert("ERROR: Key must only contain bits 0 and 1");
		return;
	}
	else if(rounds < 2){
		window.alert("ERROR: There must be atleast 2 rounds or else some of your text will be in plaintext!");
		return;
	}
	else if((rounds % 2) == 1){
		window.alert("ERROR: There must be an even amount of rounds, or some of your text will be more encrypted than the other!");
		return;
	}
	else if(!verifyText(userInput.value)){
		window.alert("ERROR: You entered an invalid character in the plaintext, acceptable characters are 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789. '");
		return;
	}

    while(userInput.value != ""){
        var userInputString = userInput.value.slice(0,2);
        userInput.value = userInput.value.slice(2);
	var encrypted = await des.encryptRounds(userInputString, rounds, key);
        document.getElementById("output-text").innerHTML += encrypted;
        for(var i = 0; i < encrypted.length; i++){
		document.getElementById("output-text-bit").innerHTML += await des.charToBits(encrypted[i]) + ",";
	}
    }
}

function verifyKey(key){
	for (var i = 0; i < key.length; i++){
		if((key[i] != "0") && (key[i] != "1")) return false;
	}
	return true;
}

function verifyText(userInput){
	for (var i = 0; i < userInput.length; i++){
		if(!des.encoding.includes(userInput[i])) return false;
	}
	return true;
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
	if (key.length != 9){
		window.alert("ERROR: Key must be of length 9");
		return;
	}
	else if(!verifyKey(key)){
		window.alert("ERROR: Key must only contain bits 0 and 1");
		return;
	}
	else if(rounds < 2){
		window.alert("ERROR: There must be atleast 2 rounds or else some of your text will be in plaintext!");
		return;
	}
	else if((rounds % 2) == 1){
		window.alert("ERROR: There must be an even amount of rounds, or some of your text will be more encrypted than the other!");
		return;
	}
	else if(!verifyText(userInput.value)){
		window.alert("ERROR: You entered an invalid character in the plaintext, acceptable characters are 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789. '");
		return;
	}

    while(userInput.value != ""){
        var userInputString = userInput.value.slice(0,2);
        userInput.value = userInput.value.slice(2);
	var decrypted = await des.decryptRounds(userInputString, rounds, key);
        document.getElementById("output-text").innerHTML += decrypted;
        for(var i = 0; i < decrypted.length; i++){
		document.getElementById("output-text-bit").innerHTML += await des.charToBits(decrypted[i]) + ",";
	}
    }
}

async function resetFunction(){
    document.getElementById("input-text").value = "";
    document.getElementById("encryption-log").innerHTML = "";
    document.getElementById("output-text").innerHTML = "";

    document.getElementById("key-input").value = "101010101";
    document.getElementById("round-input").value = "2";

	await des.resetGraphics();

}

async function inputFunction(){
	var input_node = document.getElementById("input-text");
	var output_node = document.getElementById("input-text-bit");
	var input_node_values = input_node.value.split("");
	output_node.value = ""
	if (input_node.value.split("").length == 0){
		output_node.value = "";
	}
	else{
		for(var i = 0; i < input_node_values.length; i++){
			output_node.value += await des.charToBits(input_node_values[i]) + ",";
		}
	}
}

async function inputBitFunction(){
	var input_node = document.getElementById("input-text-bit");
	var output_node = document.getElementById("input-text");
	var input_node_values = input_node.value.split(",");
	output_node.value = ""
	if (input_node.value.split(",").length == 0){
		output_node.value = "";
	}
	else{
		for(var i = 0; i < input_node_values.length; i++){
			if(input_node_values[i].length != 6){
				continue;
			}
			output_node.value += await des.bitsToChar(input_node_values[i]);
		}
	}
}

async function outputFunction(){
	var input_node = document.getElementById("output-text");
	var output_node = document.getElementById("output-text-bit");
	var input_node_values = input_node.value.split("");
	output_node.value = ""
	if (input_node.value.split("").length == 0){
		output_node.value = "";
	}
	else{
		for(var i = 0; i < input_node_values.length; i++){
			output_node.value += await des.charToBits(input_node_values[i]) + ",";
		}
	}
}

document.getElementById("pause-button").addEventListener("click", pauseFunction);
document.getElementById("encrypt-button").addEventListener("click", encryptFunction);
document.getElementById("decrypt-button").addEventListener("click", decryptFunction);
document.getElementById("reset-button").addEventListener("click", resetFunction);
document.getElementById("input-text").addEventListener("input", inputFunction);
document.getElementById("input-text-bit").addEventListener("input", inputBitFunction);
document.getElementById("output-text").addEventListener("change", outputFunction);

