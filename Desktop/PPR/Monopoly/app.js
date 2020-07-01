var board = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160];
const player1_Button = document.getElementById('player-1');
const player2_Button = document.getElementById('player-2');


console.log(board.length);
console.log(player1_Button);
console.log(player2_Button);

player1_Button.addEventListener('click', rollice_1);
player2_Button.addEventListener('click', rolldice_2);


var player1 = ["Naruto", 0, 1000];
var player2 = ["Sasuke", 0, 1000];

function rollDice_1() {
    let position = Math.floor(Math.random() * 6) + 1;
    console.log("player one roll", position);
    changeposition_1(player1[1], position);

}

function rollDice_2() {
    let position = Math.floor(Math.random() * 6) + 1;
    console.log("player two roll", position);
    changeposition_2(player2[1], position);
}


function changeposition_1(old, currentPos) {
    var newPosition = old + currentPos;
    player1[1] = newPosition;
    console.log("player-1", player1[1]);
    updateMoney_1(player1[1]);

}

function changeposition_2(old, currentPos) {
    var newPosition = old + currentPos;
    player2[1] = newPosition;
    console.log("player-2", player2[1]);
    updateMoney_1(player2[1]);

}
//update money
function changeMoney_1(p1) {
    var updateMoney = 0;

    if (p1 < board.length) {
        updateMoney = player1[2] - board[p1 - 1];
    } else {
        p1 = p1 % 15;
        updateMoney = player1[2] - board[p1 - 1];
    }
    player1[2] = updateMoney;
    console.log("player-1 money", player1[2]);
    //printplayerdata.innerHTML=player1  
}

function changeMoney_2(p1) {
    var updateMoney = 0;

    if (p1 < board.length) {
        updateMoney = player2[2] - board[p2 - 1];
    } else {
        p1 = p1 % 15;
        updateMoney = player2[2] - board[p2 - 1];
    }
    player1[2] = updateMoney;
    console.log("player-2 money", player1[2]);
    //printplayerdata.innerHTML=player2  
}