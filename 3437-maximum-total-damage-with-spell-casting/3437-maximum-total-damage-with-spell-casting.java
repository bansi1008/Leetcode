class Solution {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);
         int n=power.length;

       long[] dp=new long[n];
       dp[0]=power[0];
       long md=0;

       for(int i=1,j=0;i<n;i++){
        if(power[i]==power[i-1]){
            dp[i]=power[i]+dp[i-1];
        }
        else{
            while(power[j]+2<power[i]){
                md=Math.max(md,dp[j]);
                j++;
            }
            dp[i]=md+power[i];
        }

       }


     long max=0;

      for(long num:dp){
        max=Math.max(max,num);
      }
      return max;

        
    }
}