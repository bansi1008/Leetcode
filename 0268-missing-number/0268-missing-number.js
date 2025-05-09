/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    const a=nums.length;
     let map = new Map();
      for (let i = 0; i <a; i++) {
    map.set(nums[i], true);  
  }

   for (let i = 1; i <= a; i++) {
    if (!map.has(i)) {  
      return i;  
    }
   
  }

  return 0;
   
    
};