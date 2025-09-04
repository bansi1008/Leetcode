class Solution {
    public int maxProduct(int[] nums) {
       int currentMax = nums[0];
        int currentMin = nums[0];
        int maxProduct = nums[0];
        for(int i=1;i<nums.length;i++){
               int n = nums[i];
           int tempMax = currentMax;

            currentMax = Math.max(n, Math.max(n * currentMax, n * currentMin));
            currentMin = Math.min(n, Math.min(n * tempMax, n * currentMin));

            maxProduct = Math.max(maxProduct, currentMax);
        }
        return maxProduct;
        
    }
}