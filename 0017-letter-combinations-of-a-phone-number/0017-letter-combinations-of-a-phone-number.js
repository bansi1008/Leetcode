/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    if (digits.length === 0) return [];
    
    const mapping = {
        '2': ['a', 'b', 'c'],
        '3': ['d', 'e', 'f'],
        '4': ['g', 'h', 'i'],
        '5': ['j', 'k', 'l'],
        '6': ['m', 'n', 'o'],
        '7': ['p', 'q', 'r', 's'],
        '8': ['t', 'u', 'v'],
        '9': ['w', 'x', 'y', 'z']
    };
    
    const result = [];
    
    function backtrack(index, path) {
        if (path.length === digits.length) {
            result.push(path);
            return;
        }
        
        const letters = mapping[digits[index]];
        
        for (const letter of letters) {
            backtrack(index + 1, path + letter);
        }
    }
    
    backtrack(0, '');
    return result;
};
