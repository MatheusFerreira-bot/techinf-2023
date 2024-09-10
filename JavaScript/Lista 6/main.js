const { comparacao, csvToLines, linesToColumns, extractHeader, extractContent, rowToJSON, columnsToJSON, printCSV } = require("./func");


// Função 1 - csvToLines
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


// Função 2 - linesToColumns
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


// Função 3 - extractHeader
let texto7 = [["nome", "idade"], ["João", "28"], ["Maria", "32"]];
let esperado7 =  ["nome", "idade"];
let saida7 = extractHeader(texto7);
console.log(comparacao(esperado7, saida7));

let texto8 =  [["produto", "preço"], ["Arroz", "5.00"], ["Feijão", "7.50"]];
let esperado8 =  ["produto", "preço"];
let saida8 = extractHeader(texto8);
console.log(comparacao(esperado8, saida8));

let texto9 =  [["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"], ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]];
let esperado9 = ["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"];
let saida9 = extractHeader(texto9);
console.log(comparacao(esperado9, saida9));


// Função 4 - extractContent
let texto10 = [["nome", "idade"], ["João", "28"], ["Maria", "32"]];
let esperado10 = [["João", "28"], ["Maria", "32"]];
let saida10 = extractContent(texto10);
console.log(comparacao(esperado10, saida10));

let texto11 = [["produto", "preço"], ["Arroz", "5.00"], ["Feijão", "7.50"]];
let esperado11 = [["Arroz", "5.00"], ["Feijão", "7.50"]];
let saida11 = extractContent(texto11);
console.log(comparacao(esperado11, saida11))

let texto12 = [["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"], ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]];
let esperado12 = [["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]];
let saida12 = extractContent(texto12);
console.log(comparacao(esperado12, saida12));


// Função 5 - rowToJSON
let cabecalho1 =  ["nome", "idade"];
let linha1 = ["João", "28"];
let esperadaJSON = { nome: "João", idade: "28" };
let saidaJSON = rowToJSON(cabecalho1, linha1);
console.log(comparacao(esperadaJSON, saidaJSON));

let cabecalho2 = ["produto", "preço"];
let linha2 = ["Arroz", "5.00"];
let esperadaJSON2 = { produto: "Arroz", preço: "5.00" };
let saidaJSON2 = rowToJSON(cabecalho2, linha2);
console.log(comparacao(esperadaJSON2, saidaJSON2));

let cabecalho3 = ["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"];
let linha3 = ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"];
let esperadaJSON3 =  { Filme: "Parasita", Diretor: "Bong Joon-ho", Ano: "2019", Duração: "132", Gênero: "Drama", "País de Origem": "Coréia do Sul", "Receita Bruta": "258.8M" };
let saidaJSON3 = rowToJSON(cabecalho3, linha3);
console.log(comparacao(esperadaJSON3, saidaJSON3));


// Função 6 - columnsToJSON
let linha4 = ["nome", "idade"];
let conteudo4 = [["João", "28"], ["Maria", "32"]];
let esperadaJSON4 =  [ { nome: "João", idade: "28" }, { nome: "Maria", idade: "32" }];
let saidaJSON4 = columnsToJSON(linha4, conteudo4);
console.log(comparacao(esperadaJSON4, saidaJSON4));

let linha5 =  ["produto", "preço"] ;
let conteudo5 =  [["Arroz", "5.00"], ["Feijão", "7.50"]];
let esperadaJSON5 =  [ { produto: "Arroz", preço: "5.00" }, { produto: "Feijão", preço: "7.50" } ];
let saidaJSON5 = columnsToJSON(linha5, conteudo5);
console.log(comparacao(esperadaJSON5, saidaJSON5));

let linha6 =  ["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"];
let conteudo6 =   [["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]];
let esperadaJSON6 =  [ { Filme: "Parasita", Diretor: "Bong Joon-ho", Ano: "2019", Duração: "132", Gênero: "Drama", "País de Origem": "Coréia do Sul", "Receita Bruta": "258.8M" }, { Filme: "Green Book", Diretor: "Peter Farrelly", Ano: "2018", Duração: "130", Gênero: "Drama", "País de Origem": "EUA", "Receita Bruta": "321.8M" } ];
let saidaJSON6 = columnsToJSON(linha6, conteudo6);
console.log(comparacao(esperadaJSON6, saidaJSON6));


// Procedimento - printCSV
const fs = require('fs');   
const stringCSV = fs.readFileSync('./oscar_best_pictures.csv',{ encoding: 'utf8'});

printCSV(stringCSV);