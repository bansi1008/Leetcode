class Solution {
    public int alternatingSum(int[] nums) {
        int res=0;

        for(int i=0;i<nums.length;i++){
            if(i==0 || i%2==0){
                res+=nums[i];
                continue;
            }
            else{
                res-=nums[i];

            }

        }

        return res;
    }
}