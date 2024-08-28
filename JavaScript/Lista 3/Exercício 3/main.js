function mediaSituacao(a){
	let media;
	if(a >= 7){
		media = "Aprovado"
	}else{
		media = "Reprovado"
	}
	return media;
}

console.log(mediaSituacao(10));
console.log(mediaSituacao(7.0));
console.log(mediaSituacao(6.95));
console.log(mediaSituacao(8.8));
console.log(mediaSituacao(0));
console.log(mediaSituacao(2.725));