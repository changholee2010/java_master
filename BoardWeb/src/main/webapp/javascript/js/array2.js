// array2.js
const numAry = [23, 10, 17, 35, 9];

let result = numAry.reduce((acc, num) => {
    // console.log(acc, num);
    return acc + num;
}, 0);

result = numAry.reduce((acc, num) => {
    return acc > num ? acc : num;
}, 0);

// 1. 최소값, 2. 평균 구하기.

console.log(`결과: ${result}`);