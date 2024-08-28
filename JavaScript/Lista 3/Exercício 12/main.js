function tabuadaMult(a){
    let tabuada;
    for(let i=0;i<11;i++){
        tabuada = `${a} x ${i} = ${a*i}`;
        console.log(tabuada);
    }
}   
tabuadaMult(2);
tabuadaMult(10);