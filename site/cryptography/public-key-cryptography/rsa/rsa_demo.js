// global variables
var M = 0;
var N = 0;
var D = 0;
var E = 0;
var keySize = 0;
var dictionary = " .,abcdefghijklmnopqrstuvwxyz";

function egcd(m, n){
    var u = [Math.abs(m), 1, 0];
    var v = [Math.abs(n), 0, 1];
    while(v[0] != 0){
        var q = Math.floor(u[0]/v[0]);
        var r = [u[0] - q*v[0], u[1] - q*v[1], u[2] - q*v[2]];
        u = v;
        v = r;
    }
    return u;
}

function isPrime(number){
    if(number < 1) return false;
    let limit = Math.floor(Math.sqrt(number));
    for(var i = 2; i <= limit; i++){
        var remainder = number % i;
        if(remainder === 0){
            return false;
        }
    }
    return true;
}

function fastModPower(x, n, modulus){
    var Nc = n;
    var Y = 1;
    var Z = x;
    while(Nc > 0){
        if((Nc % 2) === 1){
            Y = Y*Z;
            Y =  Y % modulus;
            if(Y == Number.MAX_VALUE){
            	console.log('Integer overflow in fastModPower');
            }
        }

        Nc = Math.floor(Nc/2);
        
        if(Nc > 0){
            Z = Z*Z;
            if(Z == Number.MAX_VALUE){
            	console.log('Integer overflow in fastModPower');
            }
            Z = Z % modulus;
        }
    }
    return Y;
}

function rsa_step_1(){
    
    var P = parseInt(document.getElementById("P").value, 10);
    var Q = parseInt(document.getElementById("Q").value, 10);
    if (isNaN(P)){
        alert("P is not a number, please enter a valid number");
        return;
    }
    if (isNaN(Q)){
        alert("Q is not a number, please enter a valid number");
        return;
    }
    M = P*Q;
    N = (P-1)*(Q-1);
    
    if(isPrime(P) && isPrime(Q)){
        document.getElementById("m-n").innerHTML = "<b>M="+M+", N="+N+"</b>";
        document.getElementById("E").disabled = false;
        document.getElementById("rsa-second-input").disabled = false;
    }

    else{
        alert("You entered a nonprime number, please enter prime numbers for P and Q");
    }
}

function safe_mod(n, m){
    return ((n%m) + m) % m;
}

function rsa_step_2(){
    E = parseInt(document.getElementById("E").value, 10);
    if (isNaN(E)){
        alert("E is not a number, please enter a valid number");
        return;
    }
    D = safe_mod(egcd(E, N)[1], N);
    keySize = 0;
    if(D == 1){
        alert("E was not relatively prime to N, please enter a number relatively prime to N");
    }
    else{
        var modulusSize = M;
        while (modulusSize > 0){
            modulusSize -= Math.pow(dictionary.length,keySize+1);
            if (modulusSize > 0) keySize += 1;
        }

        document.getElementById("d-result").innerHTML = "<b>D="+D+"</b>";
        document.getElementById("private-public-key").innerHTML = "<b>Private Key="+D+", Public Key=("+E+","+M+")</b>";
        document.getElementById("instructions-with-keysize").innerHTML = "Text will be encoded into blocks of size: " + keySize;

        document.getElementById("encode-text").disabled = false;
        document.getElementById("decode-text").disabled = false;
    }
}

function verifyText(userInput){
	for (var i = 0; i < userInput.length; i++){
		if(!dictionary.includes(userInput[i]) && userInput[i] != '/') return false;
	}
	return true;
}

function encode(){
    
    // chunk text into blocks of keySize
    var text = document.getElementById("encode-text").value
    if (!verifyText(text)){
        alert("Invalid text entered, use text from dictionary: " + dictionary);
        return;
    }
    if(text.indexOf("/") > -1){
        text = text.split("/");
    }
    else{
        text = text.match(new RegExp('.{1,' + keySize + '}', 'g'));
    }
    while(text[text.length - 1].length < keySize){
        text[text.length - 1] = text[text.length - 1] + "z";
    }

    var results = [];
    for(var i = 0; i < text.length; i++){
        var integer = 0;

        if(text[i].length === keySize + 1){
            var maxLen = keySize + 1;
        }
        else{
            var maxLen = keySize;
        }

        for(var j = text[i].length-1; j >= 0; j--){
            var position = dictionary.indexOf(text[i][j]);
            integer += position * Math.pow(dictionary.length, maxLen-j-1);
        }
        results.push(integer);
    }
    document.getElementById("decode-text").value = results.join(",");
    document.getElementById("plain-text").disabled = false;
    document.getElementById("encrypted-text").disabled = false;
}

function decode(){
    var integers = document.getElementById("decode-text-2").value.split(",");
    var str = "";
    
    for(var i = 0; i < integers.length; i++){
        var tempString = "";
        var integer = parseInt(integers[i], 10);
        if (isNaN(integer)){
            alert("Invalid integer was entered, please check your input.");
            return;
        }
        var index = keySize-1;
        
        if(integer >= Math.pow(dictionary.length, keySize)){
		    for(var j = dictionary.length - 1; j >= 0; j--){
		        var value = j*Math.pow(dictionary.length, keySize);
		        if(value <= integer){
		            integer -= value;
		            tempString += dictionary[j];
		            break;
		        }
		    }
		}
        
        while(integer > 0){
            for(var j = dictionary.length - 1; j >= 0; j--){
                var value = j*Math.pow(dictionary.length, index);
                if(value <= integer){
                    integer -= value;
                    index -= 1;
                    tempString += dictionary[j];
                    break;
                }
            }
        }

        while(tempString.length < keySize){
            tempString += " ";
	}
        str += tempString + "/";
    }

    //remove trailing semicolon
    str = str.slice(0,-1);
    
    //remove all semicolons if all blocks are of valid keysize, indicating that a valid block of text is entered
    const matchesKeySize = (substring) => substring.length === keySize; 
    if(str.split("/").every(matchesKeySize)) str = str.split("/").join("");

    document.getElementById("encode-text-2").value = str;
    
}

function encrypt(){
    var integers = document.getElementById("plain-text").value.split(",");
    var results = [];
    for(var i = 0; i < integers.length; i++){
        var integer = parseInt(integers[i], 10);
        if(isNaN(integer)){
            alert("One of the entries was not a number, please enter valid numbers");
            return;
        }
        results.push(fastModPower(integer, E, M));
    }
    document.getElementById("encrypted-text").value = results.join(","); 
    document.getElementById("plain-text").value = "";
    document.getElementById("decode-text-2").disabled = false;
    document.getElementById("encode-text-2").disabled = false;
}

function decrypt(){
    var integers = document.getElementById("encrypted-text").value.split(",");
    var results = [];
    for(var i = 0; i < integers.length; i++){
        var integer = parseInt(integers[i], 10);
        if(isNaN(integer)){
            alert("One of the entries was not a number, please enter valid numbers");
            return;
        }
        results.push(fastModPower(integer, D, M));
    }
    document.getElementById("plain-text").value = results.join(","); 
    document.getElementById("encrypted-text").value = "";
    document.getElementById("decode-text-2").disabled = false;
    document.getElementById("encode-text-2").disabled = false;
}

document.getElementById("rsa-first-input").addEventListener("click", rsa_step_1);
document.getElementById("rsa-second-input").addEventListener("click", rsa_step_2);
document.getElementById("encode-text-button").addEventListener("click", encode);
document.getElementById("decode-text-button").addEventListener("click", decode);
document.getElementById("encrypt-text-button").addEventListener("click", encrypt);
document.getElementById("decrypt-text-button").addEventListener("click", decrypt);
