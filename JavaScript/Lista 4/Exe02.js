function indexArray(arr, element) {
    return arr.indexOf(element);
    // O método indexOf() retorna o primeiro índice no qual um determinado elemento pode ser encontrado na matriz, ou -1 se ele não estiver presente.
  }

console.log(indexArray([1, 2, 3, 4, 5], 3));
console.log(indexArray([10, 20, 30, 40, 50], 20));
console.log(indexArray([5, 10, 15, 20, 25], 25));

