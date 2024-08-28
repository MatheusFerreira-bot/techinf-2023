function addElementoInicio(arr, element){
    arr.unshift(element);
    return arr;
    // O método unshift() adiciona os elementos especificados ao início de uma matriz e retorna o novo comprimento da matriz.
}

console.log(addElementoInicio([1, 2, 3, 4, 5], 6));
console.log(addElementoInicio(["a", "b", "c"], "d"));
console.log(addElementoInicio([10], 20));
