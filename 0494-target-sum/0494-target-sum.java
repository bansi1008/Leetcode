class Solution {
    int c=0;
    public int findTargetSumWays(int[] nums, int target) {
        int i=0;
        int currentsum=0;
        backtrack(nums,target,currentsum,i);

        return c;
    }
    public void backtrack(int[] nums,int target,int currentsum,int i ){
        if(i==nums.length){
        if(target==currentsum){
            c++;
            
        }
        return;
        }
        backtrack(nums,target,currentsum+nums[i],i+1);
        backtrack(nums,target,currentsum-nums[i],i+1);
        
    }
}