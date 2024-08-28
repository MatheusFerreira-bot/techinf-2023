const { separacaoString, comparacao} = require("./local_lib");

// Cenário 1
let texto1 =  "O rato roeu a roupa do rei de Roma"
let esperado1 = ["O", "rato", "roeu", "a", "roupa", "do", "rei", "de", "Roma"];
let saida1 = separacaoString(" ",texto1)
console.log(comparacao(saida1, esperado1));

// Cenário 4
let texto2 =  "João,Maria,José";
let esperado2 = ["João", "Maria", "José"];
let saida2 = separacaoString(",",texto2);
console.log(comparacao(saida2, esperado2));

// Cenário 6
let texto3 = "fulano@gmail.com;ciclano@yahoo.com;beltrano@outlook.com";
let esperado3 =  ["fulano@gmail.com", "ciclano@yahoo.com", "beltrano@outlook.com"];
let saida3 = separacaoString(";",texto3);
console.log(comparacao(saida3, esperado3));

// Cenário 9
let texto4 = "Nome -- Sobrenome -- Idade -- País";
let esperado4 = ["Nome", "Sobrenome", "Idade", "País"];
let saida4 = separacaoString(" -- ",texto4);
console.log(comparacao(saida4, esperado4));

// Cenário 12
let texto5 = "/usr/local/bin";
let esperado5 = ["", "usr", "local", "bin"];
let saida5 = separacaoString("/", texto5);
console.log(comparacao(saida5, esperado5));

// Cenário 15
let texto6 = "JavaScript";
let esperado6 = ["J", "a", "v", "a", "S", "c", "r", "i", "p", "t"];
let saida6 = separacaoString("",texto6);
console.log(comparacao(saida6, esperado6));

// Cenário 18
let texto7 = "O sol está brilhando. O céu está azul. É um ótimo dia!"
let esperado7 = ["O sol está brilhando", "O céu está azul", "É um ótimo dia!"];
let saida7 = separacaoString(". ",texto7);
console.log(comparacao(saida7, esperado7));

// Cenário 21
let texto8 = "15/08/2024";
let esperado8 = ["15", "08", "2024"];
let saida8 = separacaoString("/",texto8);
console.log(comparacao(saida8, esperado8));

// Cenário 24
let texto9 = "14:35:20";
let esperado9 = ["14", "35", "20"];
let saida9 = separacaoString(":",texto9);
console.log(comparacao(saida9, esperado9));

// Cenário 27
let texto10 = "Primeira linha\nSegunda linha\nTerceira linha";
let esperado10 = ["Primeira linha", "Segunda linha", "Terceira linha"];
let saida10 = separacaoString("\n",texto10);
console.log(comparacao(saida10, esperado10));

// Cenário 28
let texto11 = "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit,\nsed do eiusmod tempor incididunt ut labore.";
let esperado11 =  ["Lorem ipsum dolor sit amet,", "consectetur adipiscing elit,", "sed do eiusmod tempor incididunt ut labore."];
let saida11 = separacaoString("\n",texto11);
console.log(comparacao(saida11, esperado11));

// Cenário 29
let texto12 = "Linha única sem quebras";
let esperado12 =  ["Linha única sem quebras"];
// Usamos "\0" como o separador porque:
// É muito improvável que o caractere nulo "\0" apareça em uma string comum, como "Linha única sem quebras". Portanto, o split("\0") não encontrará o separador e retornará o texto original como um único elemento em um array.
let saida12 = separacaoString("\0",texto12); // O caractere "\0" é o caractere nulo (null character).
console.log(comparacao(saida12, esperado12));

// Cenário 30
let texto13 = `Primeira linha de um texto.
Segunda linha usando template strings.
Terceira linha com mais detalhes.`;
let esperado13 =  ["Primeira linha de um texto.", "Segunda linha usando template strings.", "Terceira linha com mais detalhes."];
let saida13 = separacaoString("\n",texto13);
console.log(comparacao(saida13, esperado13));

// Cenário 31
let texto14 = `
Lorem ipsum dolor sit amet,
consectetur adipiscing elit.
Ut enim ad minim veniam.`; 
let esperado14 = ["", "Lorem ipsum dolor sit amet,", "consectetur adipiscing elit.", "Ut enim ad minim veniam."];
let saida14 = separacaoString("\n",texto14);
console.log(comparacao(saida14, esperado14));

// Cenário 32
let texto15 = `
Texto com linhas múltiplas e
uso de templates strings
para separação.
`;
let esperado15 = ["", "Texto com linhas múltiplas e", "uso de templates strings", "para separação.", ""];
let saida15 = separacaoString("\n",texto15);
console.log(comparacao(saida15, esperado15));