/**
 * Função que faz comparação entre uma Array tratada e uma Array com o resultado esperado.
 * 
 * @param {Array} str1 - Lista contendo a Array esperada.
 * @param {Array} str2 - Lista contendo a Array tratada. (Foi usado o método split());
 * @returns Retorna um boolean, onde true significa que o esperado e a tratada são iguais, e false que estão diferentes.
 */
function comparacao(str1,str2){
    return JSON.stringify(str1) == JSON.stringify(str2);
}


/**
 * Função que divide o texto em quebras de linha
 * 
 * @param {String} texto -  Uma string contendo o conteúdo de um CSV.
 * @returns Uma lista de strings, onde cada string representa uma linha do CSV.
 */
function csvToLines(texto) {
    return texto.split('\n'); // Divide o texto nas quebras de linha
}


/**
 * A função linesToColumns transforma linhas de um CSV em colunas.
 * 
 * @param {Array} linhas - Uma lista de strings, onde cada string representa uma linha do CSV.
 * @returns Uma lista de listas, onde cada lista interna contém as colunas de uma linha do CSV.
 */
function linesToColumns(linhas) {
    return linhas.map(linha => linha.split(';')); // Divide cada linha nas vírgulas/";" para obter as colunas
}


/**
 * Função que extrai o `cabeçalho` da lista.
 * 
 * @param {Array} tabela - Uma lista de listas de strings, onde cada lista interna representa colunas de uma linha do CSV.
 * @returns Uma lista contendo apenas o cabeçalho (primeira linha).
 */
function extractHeader(tabela) {
    return tabela.length > 0 ? tabela[0] : [];
}


/**
 * Função utilizada para retornar um novo array que contém todas as linhas a partir do índice 1, ou seja, excluindo a primeira linha, que é o cabeçalho.
 * 
 * @param {Array} tabela - Uma lista de listas de strings, onde cada lista interna representa colunas de uma linha do CSV.
 * @returns Uma lista de listas, contendo todas as linhas exceto o cabeçalho.
 */
function extractContent(tabela) {
    return tabela.slice(1);
}


/**
 * Função que `alinha` valor com sua respectiva chave.
 * 
 * @param {Array} header - Lista representa o cabeçalho da tabela.
 * @param {Array} linha - Lista representa uma única linha do conteúdo da tabela.
 * @returns - Um objeto JSON onde as chaves são os elementos do cabeçalho e os valores são os elementos correspondentes da linha do conteúdo
 */
function rowToJSON(header, linha){
    const obj = {}
    for (let i = 0; i < header.length; i++){
        let key = header[i];
        let value = linha[i];

        obj[key] = value;
    }
    return obj;
}


/**
 * Função que `alinha` valor com sua respectiva chave.
 * 
 * @param {Array} header - Lista representa o cabeçalho da tabela.
 * @param {Array} content - Lista representa uma única linha do conteúdo da tabela.
 * @returns  Uma lista de objetos JSON, onde as chaves são os elementos do cabeçalho e os valores são as colunas correspondentes.
 */
function columnsToJSON(header, content) {
    return content.map(linha => {
        return rowToJSON(header, linha)
    });
}


/**
 * Procedimento usado para transformar um arquivo CSV em uma tabela.
 * @param {String} texto - Uma string contendo o conteúdo de um arquivo CSV.
 * @returns Nenhuma. A função deve imprimir no console o objeto JSON convertido a partir do CSV, utilizando console.table()
 */
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