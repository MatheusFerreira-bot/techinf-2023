function removerPrimeiroElemento(arr){
    arr.shift()
    return arr;
    // O método shift() remove o primeiro elemento de um array e retorna esse elemento removido. Esse método altera o comprimento do array.
}

console.log(removerPrimeiroElemento([1, 2, 3, 4, 5]));
console.log(removerPrimeiroElemento(["a", "b", "c"]));
console.log(removerPrimeiroElemento([10]));
