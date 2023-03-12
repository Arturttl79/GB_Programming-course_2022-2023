// Zadacha_2:
// function sum2Numbers(a, b) {
//     return a + b;
// }

// const firstNum = Number.parseFloat(prompt("Vvedite pervoe chislo: "));
// const secondNum = +prompt("Vvedite vtoroe chislo: ");
// alert(`Rezultat slozheniya ${firstNum} & ${secondNum} = ${sum2Numbers(firstNum, secondNum)}`)

// Zadacha_3:
// const userName = prompt("Vvedite imya pol`zovatyelya: ");
// helloUser(userName);


// function helloUser(userName) {
//     console.log(`hello ${userName}`);
// }

// Zadacha_4:
// if (confirm("Vam horosho zhivetsya?")) {
//     alert("Togda my idyom k vam!")
// } else {
//     alert("Nu vy derzhites tam!")
// }

// Задача 5: перепишите код, используя конструкцию switch-case, запрашивая продукт через диалоговое окно.

// const product = prompt("Vvedite frukt: ");

// switch (product) {
//     case "Мандарины":
//         alert('Мандарины стоят 100 руб/кг.');
//         break;
//     case "Бананы":
//     case "Груши":
//         alert('Бананы и груши стоят 70 руб/кг.');
//         break;
//     default:
//         alert('Нет такого продукта.');
//         break;
// }

// Функция getMaxEvenElement принимает массив с целыми числами, необходимо 
// реализовать функцию так, чтобы она возвращала значение большего элемента массива, 
// который записан в четном индексе включая 0.

// function getMaxEventElement(arr) {
//     let max = arr[0];
//     for (i = 2; i < arr.length; i+=2) {
//         if (arr[i] > max) {
//             max = arr[i];            
//         }
//     }
//     return max;
// }

// console.log(getMaxEventElement([5, 7, -1, 12, 3, 0]));
// console.log(getMaxEventElement([4, -12, 29, 6, 31, 92, -50]));

// Задача с реального собеседования.

// Один покупатель старинных уникальных часов хочет приобрести для музея 
// двое часов. В магазине у хозяйки есть n разных часов с соответствующими 
// ценами [p1, ..., pn]. Покупатель хочет полностью использовать свой 
// бюджет. Необходимо выяснить получится ли это.

function f(clockArr, money) {
    for (let i = 0; i < clockArr.length - 1; i++) {
        for (let j = i + 1; j < clockArr.length; j++) {
            if (Math.floor((clockArr[i] + clockArr[j]) * 100) / 100 == money) {
                return true;
            }
        }
    }
    return false;
}

console.log(f([8.74, 3.12, 9.50, 2.35], 2.35));
console.log(f([1.1, 4.2, 7.50, 0.4], 8.4));
console.log(f([54.10, 20.00, 18.51, 97.75, 35.20, 76.42], 89.3));