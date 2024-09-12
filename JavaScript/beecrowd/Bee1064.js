var input = require('fs').readFileSync('./input.txt', 'utf8');
var lines = input.split('\n');
let pos = 0;
let soma = 0;

for (let i = 0; i < 6; i++){
    let n = Number(lines[i]);
    if (n > 0){
        pos++;
        soma += n;
    }
}

let media = soma / pos;
console.log(pos,"valores positivos");
console.log(media.toFixed(1));