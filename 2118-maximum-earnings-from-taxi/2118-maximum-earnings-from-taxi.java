class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        Map<Integer, List<int[]>> ridend = new HashMap<>();
        for (int[] r : rides) {
            ridend.computeIfAbsent(r[1], k -> new ArrayList<>()).add(r);
        }

        long[] dp=new long[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i] = dp[i - 1];
            if(ridend.containsKey(i)){
            for(int[] r:ridend.get(i)){
                int start = r[0], end = r[1], tip = r[2];
                long profit = (end - start + tip);
                dp[i]=Math.max(dp[i],dp[start]+profit);
            }
            }
            
        }

        return dp[n];
    }
}