function somaParesArray(arr){
    let pares = 0;
    for (let i = 0; i < arr.length; i++){
        if (arr[i] % 2 === 0){
            pares += arr[i];
        }
    }
    return pares;
}

console.log(somaParesArray([1, 2, 3, 4, 5]));
console.log(somaParesArray([2, 4, 6, 8]));
console.log(somaParesArray([1, 3, 5, 7]));

