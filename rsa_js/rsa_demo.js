var M = 0;
var N = 0;
async function rsa_step_1(){
    
    var P = math.bignumber(document.getElementById("P").value);
    var Q = math.bignumber(document.getElementById("Q").value);
    M = P*Q;
    N = (P-math.bignumber(1))*(Q-math.bignumber(1));
    
    document.getElementById("m-n").innerHTML = "</b>M="+M+", N="+N+"</b>";
    document.getElementById("E").disabled = false;
    document.getElementById("rsa-second-input").disabled = false;
}

async function rsa_step_2(){
    var E = math.bignumber(document.getElementById("P").value);
    var D = math.xgcd(math.bignumber(E), math.bignumber(N));
    console.log(D);
    D = D[2];
    console.log(D);
    document.getElementById("d-result").innerHTML = "<b>D="+D+"</b>";
}

document.getElementById("rsa-first-input").addEventListener("click", rsa_step_1);
document.getElementById("rsa-second-input").addEventListener("click", rsa_step_2);
