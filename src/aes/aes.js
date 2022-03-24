class Aes {

    constructor(){
        this.encoding = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789. ";
        this.sbox = ['1001', '0100', '1010', '1011',
                     '1101', '0001', '1000', '0101',
                     '0110', '0010', '0000', '0011',
                     '1100', '1110', '1111', '0111']
        this.keyLength = 12;
        this.pause = false;
		
    }
	
    async bitsToColorChar(bits){
        var colors = ['black', 'red', 'blue', 'green'];
        var color = parseInt(bits.slice(6),2);
        var text = await this.bitsToChar(bits);
        return '<span style="color:' + colors[color] + '">' + text + '</span>';
    }
    
    async drawBox(topPosition, leftPosition, width, height, name, className, content=""){
        var box = document.createElement("div");
        box.setAttribute("id", name);
        box.setAttribute("class", className);
        box.style.top = topPosition+"%";
        box.style.left = leftPosition+"%";
        box.style.width = width + "%";
        box.style.height = height + "%";
        box.innerHTML = content;

        box.style.outline = "1px solid black";
        box.style.position = 'absolute';
        var mainBox = document.getElementById("mainaesbox");
        mainBox.appendChild(box);
    }

    async drawMatrix(topPosition, leftPosition, name, nibbleWidth=4, nibbleHeight=3){
        for (var i = 0; i < 2; i++){
            for (var j = 0; j < 2; j++){
                this.drawBox(topPosition+(j*nibbleHeight), leftPosition+(i*nibbleWidth), nibbleWidth, nibbleHeight, name + '-nibble-' + i + '-' + j , 'nibble');
            }
        }
    }

    async drawSbox(topPosition, leftPosition, nibbleWidth=4, nibbleHeight=3){
        // sbox drawing
        this.drawBox(topPosition, leftPosition, nibbleWidth, nibbleHeight, 'sbox-blank'  , 'nibble');
        for(var i = 0; i < 4; i++){
            this.drawBox(topPosition, leftPosition+4+(i*nibbleWidth), nibbleWidth, nibbleHeight, 'sbox-col-' + i, 'nibble', i.toString(2).padStart(2, '0'));
            this.drawBox(topPosition+3+(i*nibbleHeight), leftPosition, nibbleWidth, nibbleHeight, 'sbox-row-' + i, 'nibble', i.toString(2).padStart(2, '0'));
            for(var j = 0; j < 4; j++){
                this.drawBox(topPosition+3+(i*nibbleHeight), leftPosition+4+(j*nibbleWidth), nibbleWidth, nibbleHeight, 'sbox-' + i + '-' + j  , 'nibble', this.sbox[i*4 + j]);
            }
        }
    }

    async drawLatex(topPosition, leftPosition, latex){
        var box = document.createElement("div");
        box.style.top = topPosition+"%";
        box.style.left = leftPosition+"%";
        box.style.position = "absolute";
        box.innerHTML = latex;
        var mainBox = document.getElementById("mix-columns");
        mainBox.appendChild(box);
        MathJax.typeset([box]);
    }

    initializeMixColumns(decrypt=false){
        var mainBox = document.getElementById("mix-columns");
        mainBox.innerHTML = "";
        this.drawLatex(6,48, '\\( = \\)');
        if(!decrypt){
            this.drawLatex(8,34, '\\( \\bmod(x^4+x+1) \\)');
            this.drawLatex(2,7, "\\[ \\begin{bmatrix}b_0x^3 + b_1x^2 + b_2x + b_3 & c_0x^3 + c_1x^2 + c_2x + c_3 \\\\b_4x^3 + b_5x^2 + b_6x + b_7 & c_4x^3 + c_5x^2 + c_6x + c_7\\end{bmatrix} \\]");
            this.drawLatex(2,2, "\\[ \\begin{bmatrix}1 & x^2 \\\\ x^2 & 1 \\end{bmatrix} \\]");
            this.drawLatex(2,50, '\\[ \\begin{bmatrix} b_0 \\oplus b_6 & b_1 \\oplus b_4 \\oplus b_7 & b_2 \\oplus b_4 \\oplus b_5 & b_3 \\oplus b_5 & c_0 \\oplus c_6 & c_1 \\oplus c_4 \\oplus c_7 & c_2 \\oplus c_4 \\oplus c_5 & c_3 \\oplus c_5 \\\\ b_2 \\oplus b_4 & b_0 \\oplus b_3 \\oplus b_5 & b_0 \\oplus b_1 \\oplus b_6 & b_1 \\oplus b_7 & c_2 \\oplus c_4 & c_0 \\oplus c_3 \\oplus c_5 & c_0 \\oplus c_1 \\oplus c_6 & c_1 \\oplus c_7\\end{bmatrix} \\]');
        }
        else{
            this.drawLatex(8,38, '\\( \\bmod(x^4+x+1) \\)');
            this.drawLatex(2,11, "\\[ \\begin{bmatrix}b_0x^3 + b_1x^2 + b_2x + b_3 & c_0x^3 + c_1x^2 + c_2x + c_3 \\\\b_4x^3 + b_5x^2 + b_6x + b_7 & c_4x^3 + c_5x^2 + c_6x + c_7\\end{bmatrix} \\]");
            this.drawLatex(2,2, "\\[ \\begin{bmatrix}x^3+1 & x \\\\ x & x^3+1 \\end{bmatrix} \\]");
            this.drawLatex(2,50, '\\[ \\begin{bmatrix} b_3 \\oplus b_5 & b_0 \\oplus b_6 & b_1 \\oplus b_4 \\oplus b_7 & b_2 \\oplus b_3 \\oplus b_4 & c_3 \\oplus c_5 & c_0 \\oplus c_6 & c_1 \\oplus c_4 \\oplus c_7 & c_2 \\oplus c_3 \\oplus c_4 \\\\ b_1 \\oplus b_7 & b_2 \\oplus b_4 & b_0 \\oplus b_3 \\oplus b_5 & b_0 \\oplus b_6 \\oplus b_7 & c_1 \\oplus c_7 & c_2 \\oplus c_4 & c_0 \\oplus c_3 \\oplus c_5 & c_0 \\oplus c_6 \\oplus c_7 \\end{bmatrix} \\]');

        }
    }

    async initializeGUI(){
        this.drawMatrix(39, 2, 'input');
        this.drawMatrix(39, 16, 'key');
        this.drawMatrix(18, 16, 'mix-columns-output');
        this.drawMatrix(39, 30, 'xored');
        this.drawMatrix(39, 74, 'sbox-output');
        this.drawMatrix(39, 90, 'shift-row');
        this.drawMatrix(72, 90, 'output-key');
        this.drawMatrix(72, 74, 'output');
        this.drawSbox(35, 44);
        this.initializeMixColumns();
    }

    async resetGraphics(){
        var matrices = ['input', 'key', 'xored', 'sbox-output', 'shift-row', 'output-key', 'output', 'mix-columns-output'];
        for(var i = 0; i < matrices.length; i++) await this.map_bits_to_matrix('                ', matrices[i], false);
        document.getElementById('mix-columns').innerHTML = '';
        this.initializeMixColumns();
        var sboxDivs = document.querySelectorAll('*[id^="sbox-"]');
        for(var i = 0; i < sboxDivs.length; i++){
            sboxDivs[i].style.backgroundColor = "";
        }
        var keyBox = document.getElementById("key-1");
        keyBox.innerHTML = '\\( K_0 \\)';
        MathJax.typeset([keyBox]);
    }

    async map_bits_to_matrix(bits, label, sleep=true){
        for(var i = 0; i < 2; i++){
            for(var j = 0; j < 2; j++){
                var id = [label, 'nibble', i, j].join('-');
                if(sleep) await this.sleep();
                document.getElementById(id).innerHTML = bits.slice(i*8+j*4, i*8+j*4+4);
            }
        }
    
    }
    async map_bits_to_nibble(bits, label, i, j){
        var id = [label, 'nibble', i, j].join('-');
        document.getElementById(id).innerHTML = bits;
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
    
    xor(bits1, ...bits_array){
        var xored = "";
        var bits = bits1;
        for(var b = 0; b < bits_array.length; b++){
            for(var i = 0; i < bits.length; i++){
                if (bits[i] != bits_array[b][i]){
                    xored += "1";
                }
                else{
                    xored += "0";
                }
            }
            bits = xored;
            xored = "";
        }
        return bits;
    }

    async keyXor(plaintext, k, last=false){
        var xored = this.xor(plaintext, k);
        if(last){
            var label = 'output';
        }
        else{
            var label = 'xored';
        }
        await this.map_bits_to_matrix(xored, label);
        await this.log('XOR key: ' + k + ' with ' + plaintext);
        return xored;
    }

    async charToBits(character, color='00'){
        var binaryString = this.encoding.indexOf(character).toString(2);
        while(binaryString.length < 6){
            binaryString = "0" + binaryString;
        }
        return binaryString + color;
    }

    async bitsToChar(bits){
	    return this.encoding[parseInt(bits.substring(0,6), 2)];
    }
    
    async sboxes(bits, decrypt=false){
        var outputColor = 'rgba(255, 0, 0, 0.5)';
        var inputColor = 'rgba(117,178,221,0.5)';
        var returnString = '';
        for(var i = 0; i < 2; i++){
            for(var j = 0; j < 2; j++){
                if(!decrypt){
                    var row = bits.slice(i*8+j*4, i*8+j*4+2);
                    var col = bits.slice(i*8+j*4+2, i*8+j*4+4);
                    var sbox = this.sbox[parseInt(row,2)*4 + parseInt(col,2)];
                    var output = sbox;
                    await this.log("Using row " + row + ", column " + col + " on sbox to retrieve " + sbox);
                }
                else{
                    outputColor = 'rgb(117,178,221,0.5)';
                    inputColor = 'rgb(255,0,0,0.5)';
                    var sbox = bits.slice(i*8+j*4, i*8+j*4+4);
                    var output = this.sbox.indexOf(sbox).toString(2).padStart(4, '0');
                    var row = output.slice(0,2);
                    var col = output.slice(2,4);
                    await this.log("Sbox inverse of " + sbox + " = " + output);
                }
                
                var rowDiv = document.getElementById('sbox-row-' + parseInt(row,2));
                var colDiv = document.getElementById('sbox-col-' + parseInt(col,2));
                var sboxDiv = document.getElementById('sbox-' + parseInt(row,2) + '-' + parseInt(col,2));
                rowDiv.style.backgroundColor = inputColor; 
                colDiv.style.backgroundColor = inputColor; 
                sboxDiv.style.backgroundColor = outputColor;
                this.map_bits_to_nibble(output, 'sbox-output', i, j);
                for(var k = 0; k < 4; k++) await this.sleep();
                rowDiv.style.backgroundColor = ''; 
                colDiv.style.backgroundColor = ''; 
                sboxDiv.style.backgroundColor = '';
                returnString += output;
            }
        }
        return returnString;
    }

    async shiftRow(bits){
        var shifted = bits.slice(0,4) + bits.slice(12,16) + bits.slice(8,12) + bits.slice(4,8);
        await this.map_bits_to_matrix(shifted, 'shift-row')
        await this.log('Shifted bits: ' + bits + ' to ' + shifted);
        return shifted
    }

    getNextKey(key, index){
        return key.substring(index, key.length) + key.substring(0, index);
    }

    mixColumnsOperation(b, decrypt=false){
        if(!decrypt){
            var o = this.xor(b[0],b[6]) + this.xor(b[1],b[4],b[7]) + this.xor(b[2],b[4],b[5]) + this.xor(b[3],b[5]);
            o += this.xor(b[2],b[4]) + this.xor(b[0],b[3],b[5]) + this.xor(b[0],b[1],b[6]) + this.xor(b[1],b[7]);
        }
        else{
            var o = "";
            o += this.xor(b[3],b[5]) + this.xor(b[0],b[6]) + this.xor(b[1],b[4],b[7]) + this.xor(b[2],b[3],b[4]);
            o += this.xor(b[1],b[7]) + this.xor(b[2],b[4]) + this.xor(b[0],b[3],b[5]) + this.xor(b[0],b[6],b[7]);
        }
        return o;
    }

    generate_latex_string_mix_columns(b, decrypt=false){
        if(!decrypt){
            var strings = [ [b[0],b[6]], [b[1],b[4],b[7]], [b[2],b[4],b[5]], [b[3],b[5]],
                            [b[2],b[4]], [b[0],b[3],b[5]], [b[0],b[1],b[6]], [b[1],b[7]] ];
        }
        else{
            var strings = [ [b[3],b[5]], [b[0],b[6]], [b[1],b[4],b[7]], [b[2],b[3],b[4]],
                            [b[1],b[7]], [b[2],b[4]], [b[0],b[3],b[5]], [b[0],b[6],b[7]] ]
        }
        var oplusStrings = [];
        for(var i=0; i < strings.length; i++){
            oplusStrings.push(strings[i].join(' \\oplus '));
        }
        return oplusStrings.join(' & ');
    }

    async mixColumns(bits, decrypt=false){
        var l = this.mixColumnsOperation(bits.slice(0,8), decrypt);
        var r = this.mixColumnsOperation(bits.slice(8,16), decrypt);
        var latex = [this.generate_latex_string_mix_columns(bits.slice(0,8), decrypt), this.generate_latex_string_mix_columns(bits.slice(8,16), decrypt)].join(' \\\\ ');
        
        if (!decrypt){
            await this.drawLatex(14,53.5, '\\[ \\begin{bmatrix}' + latex + '\\end{bmatrix} \\]');
        }
        else{
            await this.drawLatex(14,53.5, '\\[ \\begin{bmatrix}' + latex + '\\end{bmatrix} \\]');
        }
        this.map_bits_to_matrix(l + r, 'mix-columns-output');
        this.log('Mix columns mapped: ' + bits + ' to ' + l + r);
        return l + r;
    }

    async encrypt(input, key, decrypt=false){
        var keyBox = document.getElementById("key-1");
        var keyBoxOut = document.getElementById("key-2");
        if(decrypt) keyBox.innerHTML = '\\( K_2 \\)'; keyBoxOut.innerHTML = '\\( K_0 \\)';
        MathJax.typeset([keyBox, keyBoxOut]);
        var keys = ['1010011100111011', '0001110000100111', '0111011001010001'];
        if(decrypt) keys = keys.reverse();
        key = keys[0];
        await this.map_bits_to_matrix(input, 'input');
        await this.map_bits_to_matrix(key, 'key');
        var xored = await this.keyXor(input, key);
        var sboxed = await this.sboxes(xored, decrypt);
        var shifted = await this.shiftRow(sboxed);
        var mixColumns = await this.mixColumns(shifted, decrypt);
        key = this.getNextKey(key, 1);
        key = keys[1];
        if(decrypt) key = this.mixColumnsOperation(key.slice(0,8),true) + this.mixColumnsOperation(key.slice(8),true);;
        if(decrypt) keyBox.innerHTML = '\\( MC^{-1}K_1 \\)';
        else keyBox.innerHTML = '\\( K_1 \\)';
        MathJax.typeset([keyBox]);
        await this.map_bits_to_matrix(key, 'key');
        xored = await this.keyXor(mixColumns, key);
        sboxed = await this.sboxes(xored, decrypt);
        shifted = await this.shiftRow(sboxed);
        key = this.getNextKey(key, 1);
        key = keys[2];
        await this.map_bits_to_matrix(key, 'output-key');
        xored = await this.keyXor(shifted, key, true);
        await this.map_bits_to_matrix(xored, 'output');
        return xored;
    }
}

aes = new Aes();
function whenAvailable(name, callback) {
    var interval = 10; // ms
    window.setTimeout(function() {
        if (window[name]) {
            callback(window[name]);
        } else {
            whenAvailable(name, callback);
        }
    }, interval);
}

whenAvailable('MathJax', function(t) {
    aes.initializeGUI();
});

async function runAES(decrypt=false){
    await aes.resetGraphics();
    await aes.initializeMixColumns(decrypt);
    document.getElementById('output-text-bit').innerHTML = "";
    var userInput = document.getElementById("input-text");
    var userInputBit = document.getElementById("input-text-bit");
    document.getElementById("encryption-log").innerHTML = "";
    document.getElementById("output-text").innerHTML = "";

    if((userInput.value.length % 2) == 1){
        userInput.value += " ";
        userInputBit.value += "11111100,";
    }

    var key = document.getElementById("key-input").value;
	if (key.length != 16){
		window.alert("ERROR: Key must be of length 16");
		return;
	}
	else if(!verifyKey(key)){
		window.alert("ERROR: Key must only contain bits 0 and 1");
		return;
	}
	else if(!verifyText(userInput.value)){
		window.alert("ERROR: You entered an invalid character in the plaintext, acceptable characters are 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789. '");
		return;
   }
   while(userInput.value != ""){
        await aes.resetGraphics();
        await aes.initializeMixColumns(decrypt);
        var userInputString = userInputBit.value.slice(0,18).replace(',','');
        userInputBit.value = userInputBit.value.slice(18);
        userInput.value = userInput.value.slice(2);
	    var encrypted = await aes.encrypt(userInputString, key, decrypt);
        document.getElementById('output-text').innerHTML += await aes.bitsToColorChar(encrypted.slice(0,8)) + await aes.bitsToColorChar(encrypted.slice(8));
		document.getElementById("output-text-bit").innerHTML += encrypted.slice(0,8) + ',' + encrypted.slice(8) + ',';
    }

}

async function encryptFunction(){
    runAES();
}

async function decryptFunction(){
    runAES(true);
}

async function pauseFunction(){
    var playOrPause = document.getElementById("pause-button").innerHTML;

    if(playOrPause == "Pause"){
        aes.pause = true;
        document.getElementById("pause-button").innerHTML = "Resume";
    }

    else{
        aes.pause = false;
        document.getElementById("pause-button").innerHTML = "Pause";
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
		if(!aes.encoding.includes(userInput[i])) return false;
	}
	return true;
}

async function resetFunction(){
    document.getElementById("input-text").value = "";
    document.getElementById("input-text-bit").value = "";
    document.getElementById("encryption-log").innerHTML = "";
    document.getElementById("output-text-bit").innerHTML = "";
    document.getElementById("output-text").innerHTML = "";

    document.getElementById("key-input").value = "1111000011110000";

	await aes.resetGraphics();

}

async function inputFunction(){
	var input_node = document.getElementById("input-text");
	var output_node = document.getElementById("input-text-bit");
	var input_node_values = input_node.value.split("");
	output_node.value = "";
	if (input_node.value.split("").length == 0){
		output_node.value = "";
	}
	else{
		for(var i = 0; i < input_node_values.length; i++){
			output_node.value += await aes.charToBits(input_node_values[i]) + ",";
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
			if(input_node_values[i].length != 8){
				continue;
			}
			output_node.value += await aes.bitsToChar(input_node_values[i]);
		}
	}
}

async function outputFunction(){
	var input_node = document.getElementById("output-text-bit");
	var output_node = document.getElementById("output-text");
	var input_node_values = input_node.value.split(",");
	output_node.innerHTML = "";
    for(var i = 0; i < input_node_values.length; i++){
        output_node.innerHTML += await aes.bitsToColorChar(input_node_values[i]);
	}
}
document.getElementById("pause-button").addEventListener("click", pauseFunction);
document.getElementById("encrypt-button").addEventListener("click", encryptFunction);
document.getElementById("decrypt-button").addEventListener("click", decryptFunction);
document.getElementById("reset-button").addEventListener("click", resetFunction);
document.getElementById("input-text").addEventListener("input", inputFunction);
document.getElementById("input-text-bit").addEventListener("input", inputBitFunction);
document.getElementById("output-text-bit").addEventListener("change", outputFunction);

