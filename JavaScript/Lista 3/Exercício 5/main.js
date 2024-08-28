function somaNumeros(a){
    let soma = 0;
    for(let i = 1; i <= a; i++){
        soma = soma + i;
    }

    return soma;
}

console.log(somaNumeros(5));
console.log(somaNumeros(10));
console.log(somaNumeros(1));
console.log(somaNumeros(64));