function imprimirTodaTabuada() {
    for (let a = 0; a <= 10; a++) { // Loop externo para cada número de 0 a 10
        console.log(`Tabuada do ${a}:`); // Imprime o cabeçalho da tabuada
        for (let i = 0; i <= 10; i++) { // Loop interno para multiplicar de 0 a 10
            console.log(`${a} x ${i} = ${a * i}`);
        }
        console.log(''); // Adiciona uma linha em branco entre as tabuadas para melhor legibilidade
    }
}
imprimirTodaTabuada();