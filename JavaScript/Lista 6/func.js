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
* O map transforma todas as linhas do CSV em arrays de colunas. O resultado é um array de arrays, onde cada array interno contém as colunas de uma linha.*/
function linesToColumns(linhas) {
    return linhas.map(linha => linha.split(';')); // Divide cada linha nas vírgulas/";" para obter as colunas
}

// Função 3 - extractHeader
/*A função extractHeader recebe como entrada um array de listas (ou seja, uma tabela onde cada sublista representa uma linha com as colunas).
Ela verifica se a tabela tem pelo menos uma linha (tabela.length > 0).
Se sim, ela retorna a primeira linha da tabela (tabela[0]), que corresponde ao cabeçalho.
Caso contrário, ela retorna um array vazio ([]), para evitar erros se a tabela estiver vazia.*/
function extractHeader(tabela) {
    return tabela.length > 0 ? tabela[0] : [];
}

// Função 4 - extractContent
/*A função extractContent recebe como entrada uma lista de listas (tabela).
O método slice(1) é utilizado para retornar um novo array que contém todas as linhas a partir do índice 1, ou seja, excluindo a primeira linha, que é o cabeçalho.
Se o array de entrada estiver vazio ou tiver apenas uma linha (só o cabeçalho), slice(1) retornará um array vazio, pois não há mais linhas após a primeira.*/
function extractContent(tabela) {
    return tabela.slice(1);
}

// Função 5 - rowToJSON
function rowToJSON(header, linha){
    const obj = {}
    for (let i = 0; i < header.length; i++){
        let key = header[i];
        let value = linha[i];

        obj[key] = value;
    }
    return obj;
}

// Função 6 - columnsToJSON
/*A função columnsToJSON recebe dois parâmetros:
cabecalho: uma lista de strings que representa o cabeçalho (as chaves dos objetos JSON).
conteudo: uma lista de listas, onde cada sublista representa uma linha do conteúdo (valores correspondentes).
A função utiliza o método map para percorrer cada linha do conteúdo.
Para cada linha, ela cria um objeto json vazio e associa cada valor da linha à sua chave correspondente no cabeçalho, usando um loop for.
O resultado é uma lista de objetos JSON, onde cada objeto é uma representação de uma linha do conteúdo com as chaves do cabeçalho.*/
function columnsToJSON(header, content) {
    return content.map(linha => {
        return rowToJSON(header, linha)
    });
}

// // Procedimento - printCSV
// function printCSV(texto) {
//     // 1. Divide o CSV em linhas
//     const linhas = texto.split('\n');
    
//     // 2. Transforma as linhas em colunas (usando a função linesToColumns)
//     const tabela = linhas.map(linha => linha.split(';'));
    
//     // 3. Extrai o cabeçalho e o conteúdo
//     const header = tabela[0];  // Primeira linha é o cabeçalho
//     const content = tabela.slice(1);  // Restante são os dados
    
//     // 4. Converte o conteúdo para JSON (usando a função columnsToJSON)
//     const contJSON = content.map(linha => {
//         let obj = {};
//         for (let i = 0; i < header.length; i++) {
//             obj[header[i]] = linha[i];
//         }
//         return obj;
//     });
    
//     // 5. Imprime o objeto JSON usando console.table
//     console.table(contJSON);
// }

// Procedimento - printCSV
function printCSV(texto) {
    // 1. Divide o CSV em linhas
    const linhas = csvToLines(texto);
    
    // 2. Transforma as linhas em colunas (usando a função linesToColumns)
    const tabela = linesToColumns(linhas);
    
    // 3. Extrai o cabeçalho e o conteúdo
    const header = extractHeader(tabela);  // Primeira linha é o cabeçalho
    const content = extractContent(tabela);  // Restante são os dados
    
    // 4. Converte o conteúdo para JSON (usando a função columnsToJSON que contém o rowToJSON )
    const contJSON = columnsToJSON(header, content);
    
    // 5. Imprime o objeto JSON usando console.table
    console.table(contJSON);
}


module.exports = { comparacao, csvToLines, linesToColumns, extractHeader, extractContent, rowToJSON, columnsToJSON, printCSV };