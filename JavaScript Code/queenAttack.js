function canQueenAttack(qR, qC, oR, oC) {
    if (qR == oR)
        return true;

    if (qC == oC)
        return true;

    if (Math.abs(qR - oR) == Math.abs(qC - oC))
        return true;

    return false;
}

var queen1Row = 1, queen1Col = 3; 
var queen2Row = 5, queen2Col = 7;

console.log("Queen Attack : ", canQueenAttack(queen1Row, queen1Col, queen2Row, queen2Col));

if (canQueenAttack(queen1Row, queen1Col, queen2Row, queen2Col))
    console.log("Queen1 and Queen2 Can attack on each other");
else
    console.log("Queen1 and Queen2 Cannot attack on each other");