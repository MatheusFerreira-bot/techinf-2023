function fatorialNumero(a){
    let fatorial = 1;
    for(let i=1; i<=a; i++){
        fatorial = fatorial * i;
    }
    return fatorial;
}

console.log(fatorialNumero(5));
console.log(fatorialNumero(0));
console.log(fatorialNumero(3));
console.log(fatorialNumero(12));
