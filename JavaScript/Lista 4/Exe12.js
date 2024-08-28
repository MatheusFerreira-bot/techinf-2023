function somaDigitos(numero) {
    let soma = 0;
    let strNumero = numero.toString(); // Converter o número para string
    for (let i = 0; i < strNumero.length; i++) {
        soma += parseInt(strNumero[i]); // Converter o caractere de volta para número e somar
    }
    return soma;
}

console.log(somaDigitos(123)); 
console.log(somaDigitos(456)); 
console.log(somaDigitos(789)); 
