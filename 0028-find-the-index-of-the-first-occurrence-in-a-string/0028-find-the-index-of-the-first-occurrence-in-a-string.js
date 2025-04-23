/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */

var strStr = function(haystack, needle) {
    let hLen = haystack.length, nLen = needle.length;
    if (nLen === 0) return 0;

    for (let i = 0; i <= hLen - nLen; i++) {
        if (haystack.substring(i, i + nLen) === needle) {
            return i;
        }
    }

    return -1;
};
