function maiorNumero(a,b,c){
    let maior;
    if(a > b && a > c){
        maior = a;
    }else if(b > a && b > c){
        maior = b;
    }else if(c > a && c > b){
        maior = c;
    }
    return maior;
}

console.log(maiorNumero(3, 7, 5));
console.log(maiorNumero(-1, -5, -3));
console.log(maiorNumero(8, 2, 10));