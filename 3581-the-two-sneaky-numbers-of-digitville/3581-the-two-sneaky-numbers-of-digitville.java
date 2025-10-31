class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        int num1=0;
        int num2=0;
        int j=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
               if(nums[i-1]==nums[i]){
                ans[j]=nums[i];
                j++;
               }
        }
        return ans;
    }
}