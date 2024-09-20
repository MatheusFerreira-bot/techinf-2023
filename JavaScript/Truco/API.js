// Temos duas formas de se utilizar esse deckID, um definido desde o inicio com uma string, pois assim é só clicar em mostrar cartas;
let deckID = "yomoduvqk8yk";
// O outro definindo com um objeto vazio. O problema desse é o que o programa inicia com o objeto vazio, portanto temos que clicar primeiro em novo baralho, para depois mostrar as cartas.
// let deckID = {};

const deck = new Deck(deckID);

function Deck(deckID) {
    this.deckID = deckID;
    this.listOfCards = "4C,7H,AS,7D,3C,3H,3S,3D,2C,2H,2S,2D,AC,AH,AD,KC,KH,KS,KD,JC,JH,JS,JD,QC,QH,QS,QD";

    this.novoDeck = function() {
            fetch("https://deckofcardsapi.com/api/deck/new/shuffle/?cards=4C,7H,AS,7D,3C,3H,3S,3D,2C,2H,2S,2D,AC,AH,AD,KC,KH,KS,KD,JC,JH,JS,JD,QC,QH,QS,QD")
            .then(getJsonData)
            .then(function(jsonData){
            deckID = jsonData.deck_id;
        })
    }
    this.olharCartas = function(){
        fetch(`https://deckofcardsapi.com/api/deck/${this.deckID}/draw/?count=3`)
        .then(getJsonData)
        .then(atualizaInfo)
        .then(puxaCartas)
        .catch(erro => alert(erro))  
    }
    this.embaralharCartas = function() {
        fetch(`https://deckofcardsapi.com/api/deck/${this.deckID}/shuffle/?remaining=false`)
        .then(getJsonData)  
        .then(atualizaInfo)  
        .catch(erro => alert(erro))   
    }
}

// function novoDeck(){
//     fetch("https://deckofcardsapi.com/api/deck/new/shuffle/?cards=4C,7H,AS,7D,3C,3H,3S,3D,2C,2H,2S,2D,AC,AH,AD,KC,KH,KS,KD,JC,JH,JS,JD,QC,QH,QS,QD")
//     .then(getJsonData)
//     .then(function(jsonData){
//         deckID = jsonData.deck_id;
//     })
// }
function getJsonData(respostaAPI){
    const json = respostaAPI.json();
    return json;
}
function atualizaInfo(jsonData){
    if (!jsonData.success){
        throw new Error("Erro ao acessar dados da API")
    }
    const remaining = jsonData.remaining;
    const deck_id = jsonData.deck_id;
    const info1 = document.getElementById('remaining');
    const info2 = document.getElementById('deck_id');
    info1.innerText = remaining;
    info2.innerText = deck_id;
    return jsonData;
}
// function embaralharCartas(){
//     fetch(`https://deckofcardsapi.com/api/deck/${deckID}/shuffle/?remaining=false`)
//     .then(getJsonData)  
//     .then(atualizaInfo)  
//     .catch(erro => alert(erro))   
// }
function puxaCartas(jsonData){
    const cards = jsonData.cards;
    for(let i = 0; i < 3; i++){
        const id = `carta${i+1}`;
        const card = document.getElementById(id);
        let img = card.querySelector('img')
        if(img == null){
            img = document.createElement('img');
        }
        img.setAttribute('src', cards[i].image);
        card.append(img);
    }
}
// function olharCartas(){
//     fetch(`https://deckofcardsapi.com/api/deck/${deckID}/draw/?count=3`)
//     .then(getJsonData)
//     .then(atualizaInfo)
//     .then(puxaCartas)
//     .catch(erro => alert(erro))  
// }

