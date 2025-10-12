class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int k = 0;
            int max = 0; 
            for (int j = i; j < n; j++) {
                int val = s.charAt(j) - 'a';
                if (++freq[val] == 1)
                    k++; 
                max = Math.max(max, freq[val]);

                if (max * k == j - i + 1)
                    ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}