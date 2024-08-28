function notaAlfa(a){
    let result;
    if (a > 89){
        result = "A"
    }else if(a > 79){
        result = "B"
    }else if(a > 69){
        result = "C"
    }else if(a > 59){
        result = "D"
    }else{
        result = "F"
    }
    return result;
}

console.log(notaAlfa(90));
console.log(notaAlfa(75));
console.log(notaAlfa(60));
console.log(notaAlfa(0));
console.log(notaAlfa(59));
console.log(notaAlfa(89));
console.log(notaAlfa(69));
console.log(notaAlfa(79));
console.log(notaAlfa(99));