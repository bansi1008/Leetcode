/**
 * @param {number} n
 * @return {number[]}
 */
var beautifulArray = function(n) {
        if (n === 1) return [1];

    let odd = beautifulArray(Math.ceil(n / 2)).map(x => x * 2 - 1);
    let even = beautifulArray(Math.floor(n / 2)).map(x => x * 2);

    return [...odd, ...even];





};