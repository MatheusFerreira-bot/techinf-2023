function addElementoFinal(arr, element){
    arr.push(element);
    return arr;
    // O método push() adiciona os elementos especificados ao final de uma matriz e retorna o novo comprimento da matriz.
}

console.log(addElementoFinal([1, 2, 3, 4, 5], 6));
console.log(addElementoFinal(["a", "b", "c"], "d"));
console.log(addElementoFinal([10], 20));