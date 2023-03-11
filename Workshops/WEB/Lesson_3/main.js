
function sum2Numbers(a, b) {
    return a + b;
}

const firstNum = Number.parseFloat(prompt("Vvedite pervoe chislo: "));
const secondNum = +prompt("Vvedite vtoroe chislo: ");
alert(`Rezultat slozheniya ${firstNum} & ${secondNum} = ${sum2Numbers(firstNum, secondNum)}`);