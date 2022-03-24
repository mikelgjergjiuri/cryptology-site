class Transposition {

    constructor(text, columns, key){
        this.pause = false;
        this.text = text;
        this.columns = columns;
        this.rows = Math.floor(this.text.length / this.columns);
        if(this.text.length % this.columns != 0) this.rows += 1;
        this.key = this.padKey(key);
    }

    updateValues(text, columns, key){
        this.text = text;
        this.columns = columns;
        this.rows = Math.floor(this.text.length / this.columns);
        if(this.text.length % this.columns != 0) this.rows += 1;
        this.key = this.padKey(key);
    }

    padKey(key){
        // lowercase characters
        key = key.toLowerCase();
	if (key.length > this.columns) return key.substr(0, this.columns);
        while(key.length != this.columns){
            key += 'z';
        }
        // return padded key
        return key;
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
        document.getElementById('transposition-figure').innerHTML = "";
    }

    async drawBox(topPosition, leftPosition, row, column, character){
        // draws a box given coordinates topPosition, leftPosition, 
        // puts character in, and creates ID
        var box = document.createElement("div");
        box.setAttribute("id", row + "-" + column + "-box");
        box.setAttribute("class", "character-box");
        box.style.top = topPosition+"px";
        box.style.left = leftPosition;//+"px";
        box.style.position = 'absolute';
	box.style.width = Math.floor(350/this.columns);
        box.innerHTML = character;
        var mainBox = document.getElementById("transposition-figure");
        mainBox.appendChild(box);
    }

    sortKey(key){
        // https://stackoverflow.com/a/48758512 - Returns indices of sorted array
        //return Array.from(Array(key.length).keys()).sort((a, b) => key[a] < key[b] ? -1 : (key[b] < key[a]) | 0);
	key = key.split('');
	//var alphabet = "abcdefghijklmnopqrstuvwxyz";
	//for(var i = 0; i < key.length; i++) key[i] = alphabet.indexOf(key[i]);
	console.log(key);
        for(var i = 0; i < key.length; i++){
	    key[i] = [key[i], i];
	}
	console.log(key);
	key.sort(function(left, right) { return left[0] < right[0] ? -1 : 1;});
	key.sortIndices = [];
	console.log(key);
	for(var j = 0; j < key.length; j++){
		key.sortIndices.push(key[j][1]);
		key[j] = key[j][0];
	}
	console.log(key);
	return key.sortIndices;
    }

    arrayGenerator(text, length){
        var array_of_strings = text.match(new RegExp('.{1,' + length + '}', 'g'));
	for(var i = 0; i < array_of_strings.length; i++) array_of_strings[i] = array_of_strings[i].split("");
	return array_of_strings;
    }
    
    async initFigure(){
        var fig = document.getElementById("transposition-figure");
        fig.style.width = 700;
	var width = Math.floor(335/this.columns);
        fig.style.height = this.rows*30 + 60;
        fig.style.outline = "1px solid black";
	var sortedKey = this.sortKey(this.key);
	for(var i = 0; i < sortedKey.length; i++){
            await this.drawBox(0, i*width+365, "sortedkey", i, sortedKey[i]);
            await this.drawBox(0, i*width, "key", i, this.key[i]);
	}
	console.log(sortedKey, this.key);
	return sortedKey;
    }

    async decryptText(){
        await this.resetGraphics();
        await this.initFigure();
        var decryptedText = "";
        var columnArray = this.arrayGenerator(this.text, Math.floor(this.text.length / this.columns));
	var dupArray = columnArray;
	var sortedIndices = await this.initFigure();
        console.log(this.text);console.log(columnArray);
	var width = Math.floor(335/this.columns);
        for(var i = 0; i < this.rows; i++){
            for(var j = 0; j < this.columns; j++){
                // make an attempt to get a character
                // if nothing is there just move on
                try {
                    await this.drawBox(i*30+60, j*width, i, j, columnArray[j][i]);
                    await this.sleep();
                }
                catch { continue };
            }
        }
        for(var i = 0; i < this.rows; i++){
            for(var j = 0; j < this.columns; j++){
		await this.drawBox(i*30+60,sortedIndices[j]*width+365,j+'sorted',i,columnArray[j][i]);
		}
		await this.sleep();
	}
	for(var j = 0; j < this.columns; j++){
		for(var i = 0; i < this.rows; i++){
                	dupArray[sortedIndices[j]][i] = columnArray[j][i];
		}
	}
	for(var j = 0; j < this.columns; j++){
		for(var i = 0; i < this.rows; i++){
                	decryptedText += dupArray[j][i];
		}
	}
	    document.getElementById("output-text").value = decryptedText;
    }

    async encryptText(){
        await this.resetGraphics();
        await this.initFigure();
        var encryptedText = "";
        var rowArray = this.arrayGenerator(this.text, Math.floor(this.text.length / this.rows));
	var sortedIndices = await this.initFigure();
	var width = Math.floor(335/this.columns);
        for(var i = 0; i < this.columns; i++){
            for(var j = 0; j < this.rows; j++){
                // make an attempt to get a character
                // if nothing is there just move on
                try {
                    await this.drawBox(j*30+60, i*width, j, i, rowArray[j][i]);
                    await this.sleep();
                }
                catch { continue };
            }
        }
        for(var i = 0; i < this.rows; i++){
            for(var j = 0; j < this.columns; j++){
		await this.drawBox(i*30+60,j*width+365,j+'sorted',i,rowArray[i][sortedIndices[j]]);
		}
		await this.sleep();
	}
	for(var j = 0; j < this.columns; j++){
		for(var i = 0; i < this.rows; i++){
                	encryptedText += rowArray[i][sortedIndices[j]];
		}
	}
	document.getElementById("output-text").value = encryptedText;
    }

}

// class is initialized blank
var trans = new Transposition("placeholder", 1, "z");

function pauseFunction(){

    var playOrPause = document.getElementById("pause-button").innerHTML;

    if(playOrPause == "Pause"){
        trans.pause = true;
        document.getElementById("pause-button").innerHTML = "Resume";
    }

    else{
        trans.pause = false;
        document.getElementById("pause-button").innerHTML = "Pause";
    }
}

async function encrypt(){
    var userInput = document.getElementById("input-text");
    document.getElementById("output-text").innerHTML = "";

    var key = document.getElementById("key-input").value;
    var columns = document.getElementById("column-input").value;
    while(userInput.value.length % columns != 0) userInput.value += "z"; 
    
    trans.updateValues(userInput.value, columns, key);
    await trans.encryptText();

}
async function decrypt(){
    var userInput = document.getElementById("input-text");
    document.getElementById("output-text").innerHTML = "";

    var key = document.getElementById("key-input").value;
    var columns = document.getElementById("column-input").value;
    trans.updateValues(userInput.value, columns, key);
    await trans.decryptText();
}

document.getElementById("pause-button").addEventListener("click", pauseFunction);
document.getElementById("encrypt-button").addEventListener("click", encrypt);
document.getElementById("decrypt-button").addEventListener("click", decrypt);
