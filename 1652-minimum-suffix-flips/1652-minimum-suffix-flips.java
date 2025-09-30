class Solution {

    public int minFlips(String target) {

                 int ans = target.charAt(0) == '1' ? 1 : 0;
                   for (int i = 1; i < target.length(); i++) {
            if (target.charAt(i) != target.charAt(i - 1)) {
                ans++;
            }
        }

        return ans;

        
    }
}