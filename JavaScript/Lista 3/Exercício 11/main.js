function ehBissexto(ano) {
    // Verifica se o ano é divisível por 4
    if (ano % 4 === 0) {
        // Se o ano for divisível por 100, ele também precisa ser divisível por 400
        if (ano % 100 === 0) {
            return ano % 400 === 0;
        }
        return true; // Divisível por 4 e não por 100, então é bissexto
    }
    return false; // Não é divisível por 4, então não é bissexto
}

console.log(ehBissexto(2020)); 
console.log(ehBissexto(2024));
console.log(ehBissexto(1990)); 
console.log(ehBissexto(2014)); 
console.log(ehBissexto(2025)); 
console.log(ehBissexto(1900)); 
console.log(ehBissexto(2000)); 
console.log(ehBissexto(2100)); 
