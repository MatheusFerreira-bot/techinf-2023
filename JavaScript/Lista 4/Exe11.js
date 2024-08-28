function mediaArray(arr) {
    let soma = 0;
    for (let i = 0; i < arr.length; i++) {
        soma += arr[i]; // Somar todos os elementos do array
    }
    let media = soma / arr.length; // Calcular a média
    return media;
}

console.log(mediaArray([1, 2, 3, 4, 5]));    
console.log(mediaArray([10, 20, 30, 40, 50]));    
console.log(mediaArray([5, 5, 5, 5, 5]));    

