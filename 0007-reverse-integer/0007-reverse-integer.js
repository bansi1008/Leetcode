/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let str = x.toString(); 
    let reversedStr = str.split('').reverse().join('');

    if (str[0] === "-") {
        reversedStr = '-' + reversedStr.slice(0, reversedStr.length - 1);
    }

    reversedStr = reversedStr.replace(/^0+/, ''); // Remove leading zeros
    let reversedInt = parseInt(reversedStr, 10);

    // If the parsed value is NaN, return 0
    if (isNaN(reversedInt)) {
        return 0;
    }

    // Check for overflow (32-bit signed integer range)
    if (reversedInt < -(2 ** 31) || reversedInt > (2 ** 31) - 1) {
        return 0;
    }

    return reversedInt;
};
