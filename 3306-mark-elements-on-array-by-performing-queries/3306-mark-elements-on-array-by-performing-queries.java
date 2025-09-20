import java.util.*;

class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        int n = nums.length;
        long[] ans = new long[queries.length];
        boolean[] marked = new boolean[n];
        long sum = 0;
        for (int num : nums) sum += num;

        TreeSet<int[]> set = new TreeSet<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; 
            return a[1] - b[1];                   
        });

        for (int i = 0; i < n; i++) {
            set.add(new int[]{nums[i], i});
        }

        for (int q = 0; q < queries.length; q++) {
            int index = queries[q][0];
            int k = queries[q][1];

            if (!marked[index]) {
                sum -= nums[index];
                marked[index] = true;
                set.remove(new int[]{nums[index], index});
            }

          
            Iterator<int[]> it = set.iterator();
            int count = 0;
            while (it.hasNext() && count < k) {
                int[] pair = it.next();
                int idx = pair[1];
                sum -= nums[idx];
                marked[idx] = true;
                it.remove(); 
                count++;
            }

            ans[q] = sum;
        }

        return ans;
    }
}
