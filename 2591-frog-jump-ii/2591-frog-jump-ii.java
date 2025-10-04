class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        int max = 0;

        
        for (int i = 2; i < n; i++) {
            int jump = stones[i] - stones[i - 2];
            max = Math.max(max, jump);
        }

        
        max = Math.max(max, stones[1] - stones[0]);

        return max;
    }
}
