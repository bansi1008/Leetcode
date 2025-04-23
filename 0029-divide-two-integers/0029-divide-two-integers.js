/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */

var divide = function(dividend, divisor) {
    const INT_MAX = 2 ** 31 - 1;
    const INT_MIN = -(2 ** 31);

    // Edge case: overflow
    if (dividend === INT_MIN && divisor === -1) return INT_MAX;

    // Special case: divisor is 1 or -1
    if (divisor === 1) return dividend;
    if (divisor === -1) return -dividend;

    // Convert both to negative numbers for safety (avoid overflow)
    let negatives = 2;
    if (dividend > 0) {
        dividend = -dividend;
        negatives--;
    }
    if (divisor > 0) {
        divisor = -divisor;
        negatives--;
    }

    let quotient = 0;

    while (dividend <= divisor) {
        let tempDivisor = divisor;
        let multiple = 1;

        while (tempDivisor >= (INT_MIN >> 1) && dividend <= (tempDivisor << 1)) {
            tempDivisor <<= 1;
            multiple <<= 1;
        }

        dividend -= tempDivisor;
        quotient += multiple;
    }

    return negatives === 1 ? -quotient : quotient;
};
