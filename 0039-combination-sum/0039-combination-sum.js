/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    const result = [];

    const backtrack = (start, combo, sum) => {
        if (sum === target) {
            result.push([...combo]);
            return;
        }
        if (sum > target) return;

        for (let i = start; i < candidates.length; i++) {
            combo.push(candidates[i]);
            backtrack(i, combo, sum + candidates[i]); // reuse the same element
            combo.pop(); // undo the choice
        }
    };

    backtrack(0, [], 0);
    return result;
};
