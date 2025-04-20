/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
   let left = 0, right = height.length - 1;
  let maxWater = 0;

  while (left < right) {
  
    const width = right - left;
    const minHeight = Math.min(height[left], height[right]);
    maxWater = Math.max(maxWater, width * minHeight);

    
    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }

  return maxWater;




    
};