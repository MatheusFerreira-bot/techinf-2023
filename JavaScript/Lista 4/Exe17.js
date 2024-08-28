function apenasNumeros(str) {
    return /^\d+$/.test(str); // Verificar se a string contém apenas números
}

console.log(apenasNumeros("12345")); 
console.log(apenasNumeros("abc123")); 
console.log(apenasNumeros("67890")); 
