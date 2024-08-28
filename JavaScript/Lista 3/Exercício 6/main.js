function ehPrimo(n) {
    if (n <= 1) {
        return false; // Números menores ou iguais a 1 não são primos
    }

    // Verificar divisibilidade até a raiz quadrada de n
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) {
            return false; // Se n for divisível por i, não é primo
        }
    }

    return true; // Se não houver divisores, n é primo
}

console.log(ehPrimo(7));  
console.log(ehPrimo(10)); 
console.log(ehPrimo(13)); 
console.log(ehPrimo(0));  
console.log(ehPrimo(1));  
console.log(ehPrimo(2));  
