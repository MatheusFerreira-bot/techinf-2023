/*Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.*/

var input = require('fs').readFileSync('./input.txt', 'utf8');
var lines = input.split('\n');

let par = 0;

for (let i = 0; i < 5; i++){
    let n = Number(lines[i]);

    if (n % 2 === 0){
        par++;
    }
}

console.log(par)
