var input = require('fs').readFileSync('./input.txt', 'utf8');
var tokens = input.trim().split(" ")
let codigo = Number(tokens[0]);
let quant = Number(tokens[1]);

function lanche(val){
    const preco = {
        1: 4.00,
        2: 4.50,
        3: 5.00,
        4: 2.00,
        5: 1.50
    } 
    return preco[val];
}

let total = quant * lanche(codigo);
console.log("Total: R$",total.toFixed(2));