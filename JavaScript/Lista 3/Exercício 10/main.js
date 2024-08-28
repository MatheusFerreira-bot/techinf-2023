function vogalConsoante(letra){
    let resposta;
    if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"){
        resposta = "Vogal";
    }else{
        resposta = "Consoante";
    }
    return resposta;
}

console.log(vogalConsoante("a"));
console.log(vogalConsoante("b"));
console.log(vogalConsoante("e"));
console.log(vogalConsoante("x"));
console.log(vogalConsoante("y"));