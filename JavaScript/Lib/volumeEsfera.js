function volumeEsfera(a){
    let resultadoVolume = (4 * Math.PI * Math.pow(a,3)) / 3;
    return resultadoVolume;
}
console.log(volumeEsfera(3));
console.log(volumeEsfera(5));
console.log(volumeEsfera(1.5));