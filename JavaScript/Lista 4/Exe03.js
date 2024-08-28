function numeroArray(arr, element){
    return arr.includes(element);
    // Para verificar se um array possui um determinado valor em seus elementos podemos usar a função includes().
}


console.log(numeroArray([1, 2, 3, 4, 5], 3));
console.log(numeroArray([10, 20, 30, 40, 50], 25));
console.log(numeroArray([100, 200, 300], 100));