class Solution {
    public int longestPalindromeSubseq(String s) {
        int t=s.length();
        int[][] dp=new int[t][t];

        for(int i=0;i<t;i++){
            dp[i][i]=1;
        }

        for(int i=2;i<=t;i++){
              for(int j=0;j<=t-i;j++){
                int k=j+i-1;

                if(s.charAt(k)==s.charAt(j)){
                    if(i==2){
                        dp[j][k]=2;
                    }
                    else{
                        dp[j][k]=2+dp[j+1][k-1];
                    }
                }
                else{
                    dp[j][k]=Math.max(dp[j+1][k],dp[j][k-1]);
                }
              }
        }

    return dp[0][t-1];
        
    }
}