class Solution {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int n1=2,n2=3,n3=5;
        int i1=0,i2=0,i3=0;

        for(int i=1;i<n;i++){
            int ne=Math.min(n1,Math.min(n2,n3));
            dp[i]=ne;
            if(ne==n1){
                i1++;
                n1=dp[i1]*2;
            }
             if(ne==n2){
                i2++;
                n2=dp[i2]*3;
            }
             if(ne==n3){
                i3++;
                n3=dp[i3]*5;
            }
        }

        return dp[n-1];
    }
}