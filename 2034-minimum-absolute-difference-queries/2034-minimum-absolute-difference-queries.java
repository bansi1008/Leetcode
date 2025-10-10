class Solution {
    public int[] minDifference(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        int[] ans = new int[q];
        
       
        int[][] prefix = new int[n + 1][101];
        for (int i = 0; i < n; i++) {
            for (int x = 1; x <= 100; x++) {
                prefix[i + 1][x] = prefix[i][x];
            }
            prefix[i + 1][nums[i]]++;
        }
        
       
        for (int i = 0; i < q; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            
         
            int[] freq = new int[101];
            for (int x = 1; x <= 100; x++) {
                freq[x] = prefix[ri + 1][x] - (li > 0 ? prefix[li][x] : 0);
            }
            
           
            int min = Integer.MAX_VALUE;
            int prev = -1;
            for (int x = 1; x <= 100; x++) {
                if (freq[x] > 0) {
                    if (prev != -1) {
                        min = Math.min(min, x - prev);
                    }
                    prev = x;
                }
            }
            ans[i] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
        
        return ans;
    }
}