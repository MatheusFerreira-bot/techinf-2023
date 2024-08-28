function imparPar(a){
    let result;

    if (a % 2 == 0){
        result = "Par"
    }else{
        result = "Ímpar"
    }
    return result;
}

console.log(imparPar(4))
console.log(imparPar(7))
console.log(imparPar(0))
console.log(imparPar(-5))