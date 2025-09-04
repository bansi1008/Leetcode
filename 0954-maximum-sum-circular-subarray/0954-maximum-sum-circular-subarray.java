class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curentmax=nums[0];
        int maxsum=nums[0];
        int currentmin=nums[0];
        int minsum=nums[0];
        int t=nums[0];

        for(int i=1;i<nums.length;i++){
            curentmax=Math.max(nums[i],nums[i]+curentmax);
            maxsum=Math.max(maxsum,curentmax);
            currentmin=Math.min(nums[i],currentmin+nums[i]);
            minsum=Math.min(minsum,currentmin);


    t+=nums[i];

        }
          if(maxsum<0){
            return maxsum;
          }

          return Math.max(maxsum,t-minsum);

        
    }
}