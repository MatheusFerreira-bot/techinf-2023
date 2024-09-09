const { comparacao, csvToLines, linesToColumns } = require("./func");

// Função 0 e 1
let texto1 = "nome;idade\nJoão;28\nMaria;32";
let esperado1 =  ["nome;idade", "João;28", "Maria;32"];
let saida1 = csvToLines(texto1);
console.log(comparacao(esperado1, saida1))

let texto2 =  "produto;preço\nArroz;5.00\nFeijão;7.50"
let esperado2 = ["produto;preço", "Arroz;5.00", "Feijão;7.50"]
let saida2 = csvToLines(texto2);
console.log(comparacao(esperado2, saida2))

let texto3 = "Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta\nParasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M\nGreen Book;Peter Farrelly;2018;130;Drama;EUA;321.8M";
let esperado3 = ["Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta", "Parasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M", "Green Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"];
let saida3 = csvToLines(texto3);
console.log(comparacao(esperado3, saida3));

// Função 2
let texto4 = ["nome;idade", "João;28", "Maria;32"]
let esperado4 = [["nome", "idade"], ["João", "28"], ["Maria", "32"]]
let saida4 = linesToColumns(texto4);
console.log(comparacao(esperado4, saida4));

let texto5 = ["produto;preço", "Arroz;5.00", "Feijão;7.50"];
let esperado5 = [["produto", "preço"], ["Arroz", "5.00"], ["Feijão", "7.50"]];
let saida5 = linesToColumns(texto5);
console.log(comparacao(esperado5, saida5));

let texto6 = ["Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta", "Parasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M", "Green Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"];
let esperado6 = [["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"], ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]];
let saida6 = linesToColumns(texto6);
console.log(comparacao(esperado6, saida6));