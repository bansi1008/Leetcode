class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        
        int[] p=new int[max+1];
        for(int num:nums){
            p[num]+=num;
        }

        int[] dp=new int[max+1];
        dp[0]=p[0];
        dp[1]=p[1];

        for(int j=2;j<=max;j++){

           dp[j]=Math.max(dp[j-1],p[j]+dp[j-2]);
        }
        return dp[max];
        

        
    }
}