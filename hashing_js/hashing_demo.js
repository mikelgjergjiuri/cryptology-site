class Hash {

    constructor(){
        this.encoding = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789. ";
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

    async xor(bits1, bits2, index){
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



var hasher = new Hash();

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

    while((userInput.value.length % 4) == 1){
        userInput.value += " ";
    }

    var key = document.getElementById("key-input").value;

    while(userInput.value != ""){
        var userInputString = userInput.value.slice(0,2);
        userInput.value = userInput.value.slice(2);
        document.getElementById("output-text").innerHTML += await hasher.xor(userInputString, rounds, key);
    }
}

document.getElementById("pause-button").addEventListener("click", pauseFunction);
document.getElementById("hash-button").addEventListener("click", encryptFunction);
