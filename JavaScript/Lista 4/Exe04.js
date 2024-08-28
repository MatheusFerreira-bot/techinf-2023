function removerUltimoElemento(arr){
    arr.pop()
    return arr;
    // O método pop() remove o último elemento de um array e retorna esse elemento. Esse método altera o comprimento do array.
}

console.log(removerUltimoElemento([1, 2, 3, 4, 5]));
console.log(removerUltimoElemento(["a", "b", "c"]));
console.log(removerUltimoElemento([10]));