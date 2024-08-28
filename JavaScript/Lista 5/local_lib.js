function separacaoString(separador,texto){
    return texto.split(separador)
}

function comparacao(str1,str2){
    return JSON.stringify(str1) == JSON.stringify(str2);
}

module.exports = { separacaoString, comparacao };