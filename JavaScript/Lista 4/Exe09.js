function somaArray(arr){
    let soma = 0;
    for (let i = 0; i < arr.length; i++) {
        soma += arr[i];
    }
    return soma;
}

console.log(somaArray([1, 2, 3, 4, 5]));
console.log(somaArray([2, 4, 6, 8]));
console.log(somaArray([1, 3, 5, 7]));
