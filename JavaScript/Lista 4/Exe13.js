function maiorNumeroArray(arr) {
    let maior = arr[0]; // Inicializar com o primeiro elemento do array
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > maior) {
            maior = arr[i]; // Atualizar se encontrar um número maior
        }
    }
    return maior;
}

console.log(maiorNumeroArray([1, 2, 3, 4, 5]));      
console.log(maiorNumeroArray([-1, -2, -3, -4, -5])); 
console.log(maiorNumeroArray([10, 20, 30, 40, 50]));  
