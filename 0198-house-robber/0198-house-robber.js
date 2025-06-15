/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    if (!nums.length) return 0;
  if (nums.length === 1) return nums[0];

  let prev1 = 0; 
  let prev2 = 0; 

  for (let num of nums) {
    let temp = prev2;
    prev2 = Math.max(prev1 + num, prev2); 
    prev1 = temp;
  }

  return prev2;


    
};