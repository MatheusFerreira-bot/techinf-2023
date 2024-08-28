function stringVazia(str){
    return str === "";
    // É nessa hora que entra o símbolo de “idêntico a” (===). Ele não só compara os valores dos dois lados da equação, como também verifica se eles são do mesmo tipo.
}

console.log(stringVazia(""));      
console.log(stringVazia("hello"));  
console.log(stringVazia(" "));      