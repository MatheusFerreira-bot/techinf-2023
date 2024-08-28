function removeEspacos(str) {
    return str.replace(/\s/g, ""); // Substituir todos os espaços por uma string vazia
    // O método replace() retorna uma nova string com uma, algumas ou todas as correspondências.
}

console.log(removeEspacos("hello world")); 
console.log(removeEspacos(" a b c "));   
console.log(removeEspacos(" "));   
