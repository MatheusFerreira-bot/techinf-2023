function concatenarDoisArrays(arr, arr1){
    return arr.concat(arr1);
    // O método concat() é usado para mesclar dois ou mais arrays. Este método não altera os arrays existentes, mas retorna um novo array.
};

console.log(concatenarDoisArrays([1, 2, 3], [4, 5, 6]));
console.log(concatenarDoisArrays(["a", "b"], ["c", "d"]));
console.log(concatenarDoisArrays([], [1, 2, 3]));