class Solution {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);
        
        TreeMap<Long, Long> freq = new TreeMap<>();

        for(int val:power){
            freq.put((long) val, freq.getOrDefault((long) val, 0L) + 1);
        }

        List<Long> keys = new ArrayList<>(freq.keySet());
        int n = keys.size();
        long[] dp = new long[n];
        dp[0] = keys.get(0) * freq.get(keys.get(0));

         int p = -1;
        for (int i = 1; i < n; i++) {
            long curr = keys.get(i);
            long currval = curr * freq.get(curr);

            while (p + 1 < i && keys.get(p + 1) < curr - 2)
                p++;

            long in = currval + (p >= 0 ? dp[p] : 0);
            long ex = dp[i - 1];
            dp[i] = Math.max(in, ex);
        }
        return dp[n - 1];



      

        
    }
}