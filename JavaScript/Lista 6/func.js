// Função 0 - comparacao 
function comparacao(str1,str2){
    return JSON.stringify(str1) == JSON.stringify(str2);
}

// Função 1 - csvToLines
function csvToLines(texto) {
    return texto.split('\n'); // Divide o texto nas quebras de linha
}

// Função 2 - linesToColumns
/*A função linesToColumns transforma linhas de um CSV em colunas. Ela recebe uma lista de strings (linhas do CSV), usa o método map() para percorrer cada linha, e o método split(';') para dividir cada linha nas colunas separadas por ;. O resultado é uma lista de listas, onde cada sublista representa as colunas de uma linha.
* O método map() é usado para iterar sobre o array de linhas. Ele percorre cada elemento (linha) do array e aplica a função que definimos para cada um deles.
* O map retorna um novo array, onde cada elemento é o resultado da função que passamos.
* O map transforma todas as linhas do CSV em arrays de colunas. O resultado é um array de arrays, onde cada array interno contém as colunas de uma linha.
*/
function linesToColumns(linhas) {
    return linhas.map(linha => linha.split(';')); // Divide cada linha nas vírgulas/";" para obter as colunas
}

module.exports = { comparacao, csvToLines, linesToColumns };