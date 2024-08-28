function posNegZero(a){
	let result = 0

	if (a > 0){
		result = "Positivo"
	}else if (a < 0){
		result = "Negativo"
	}else{
		result = "Zero"
	}

	return result;
}

console.log(posNegZero(5));
console.log(posNegZero(-3));
console.log(posNegZero(0));
console.log(posNegZero("1110"));
console.log(posNegZero("-987654321"));