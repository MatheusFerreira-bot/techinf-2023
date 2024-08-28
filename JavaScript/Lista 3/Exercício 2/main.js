function menorNumero3(a,b,c){
	let menor = 0
	if (a < b && a < c){
		menor = a;
	}else if(b < a && b < c){
		menor = b;
	}else if(c < a && c < b){
		menor = c;
	} 
	return menor;
}

console.log(menorNumero3(3,7,5));
console.log(menorNumero3(-1,-5,-3));
console.log(menorNumero3(8, 2, 10));