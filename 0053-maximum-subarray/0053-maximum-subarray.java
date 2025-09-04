class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int cur=0;

        for(int i=0;i<nums.length;i++){
            cur=Math.max(cur,0);
            cur+=nums[i];
            max=Math.max(max,cur);
        }
        return max;
    }
}