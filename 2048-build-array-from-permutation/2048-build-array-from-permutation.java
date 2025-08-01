class Solution {
    public int[] buildArray(int[] nums) {
   int[] b=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            b[i]=nums[t];
        }

        return b;
        
    }
}