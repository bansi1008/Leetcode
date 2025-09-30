class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int n=nums.length;
        return dfs(nums,n);

        
    }

    public int dfs(int[] nums,int n){
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            nums[i]=(nums[i]+nums[i+1])%10;
        }
       return  dfs(nums,n-1);

        



    }
}