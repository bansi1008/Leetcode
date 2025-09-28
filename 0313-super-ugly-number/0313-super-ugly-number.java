class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {

        long[] dp =new long[n];
        long[] next =new long[primes.length];
        int[] idx =new int[primes.length];
       
        int k=primes.length;
        dp[0]=1;

         for (int i = 0; i < k; i++) {
            next[i] = primes[i];
        }

        for(int i=1;i<n;i++){
            long ne=next[0];

            for(int j=0;j<k;j++){
                ne = Math.min(ne, next[j]);
            }
            dp[i]=ne;

            for (int j = 0; j < k; j++) {
                if (next[j] == ne) {
                    idx[j]++;
                    next[j] = primes[j] * dp[idx[j]];
                }
            }
            
        }
        int res=(int)dp[n - 1];
        
        return res;
        
    }
}