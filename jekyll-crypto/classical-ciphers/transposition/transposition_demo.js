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
        box.style.left = leftPosition+"px";
        box.style.position = 'absolute';
        box.innerHTML = character;
        var mainBox = document.getElementById("transposition-figure");
        mainBox.appendChild(box);
    }

    sortKey(key){
        // https://stackoverflow.com/a/48758512 - Returns indices of sorted array
        return Array.from(Array(key.length).keys()).sort((a, b) => test[a] < test[b] ? -1 : (key[b] < key[a]) | 0);
    }

    arrayGenerator(text, length, interval){
        var array = [];
        var i = 0;
        console.log(text, length, interval, this.rows, this.columns);
        while(i < interval - 1){
            var str = text.substr(i*length, (i+1)*length+1);
            array.push(str);
            i++;
        }
        // get leftover text
        array.push(text.substr(i*length));
        console.log(array);
        return array;
    }
    
    initFigure(){
        var fig = document.getElementById("transposition-figure");
        fig.style.width = this.columns*30;
        fig.style.height = this.rows*30 ;
        //fig.style.outline = "1px solid black";
    }

    async decryptText(){
        await this.resetGraphics();
        this.initFigure();
        var decryptedText = "";
        var columnArray = this.arrayGenerator(this.text, Math.floor(this.text.length / this.columns), this.rows);
        console.log(this.text);console.log(columnArray);
        for(var i = 0; i < this.rows; i++){
            for(var j = 0; j < this.columns; j++){
                // make an attempt to get a character
                // if nothing is there just move on
                try {
                    decryptedText += columnArray[j][i];
                    document.getElementById("output-text").innerHTML += columnArray[j][i];
                    await this.drawBox(i*30+30, j*30+30, i, j, columnArray[j][i]);
                    await this.sleep();
                }
                catch { continue };
            }
        }
    }

    async encryptText(){
        await this.resetGraphics();
        this.initFigure();
        var encryptedText = "";
        var rowArray = this.arrayGenerator(this.text, Math.floor(this.text.length / this.rows), this.columns);
        for(var i = 0; i < this.columns; i++){
            for(var j = 0; j < this.rows; j++){
                // make an attempt to get a character
                // if nothing is there just move on
                try {
                    encryptedText += rowArray[j][i];
                    document.getElementById("output-text").innerHTML += rowArray[j][i];
                    await this.drawBox(i*30+30, j*30+30, j, i, rowArray[j][i]);
                    await this.sleep();
                }
                catch { continue };
            }
        }
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
    document.getElementById("encryption-log").innerHTML = "";
    document.getElementById("output-text").innerHTML = "";

    var key = document.getElementById("key-input").value;
    var columns = document.getElementById("column-input").value;
    
    trans.updateValues(userInput.value, columns, key);
    await trans.encryptText();

}
async function decrypt(){
    var userInput = document.getElementById("input-text");
    document.getElementById("encryption-log").innerHTML = "";
    document.getElementById("output-text").innerHTML = "";

    var key = document.getElementById("key-input").value;
    var columns = document.getElementById("column-input").value;
    
    trans.updateValues(userInput.value, columns, key);
    await trans.decryptText();
}

document.getElementById("pause-button").addEventListener("click", pauseFunction);
document.getElementById("encrypt-button").addEventListener("click", encrypt);
document.getElementById("decrypt-button").addEventListener("click", decrypt);
