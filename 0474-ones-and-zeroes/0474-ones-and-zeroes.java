class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        
        int[][] dp=new int[m+1][n+1];
        for(String s:strs){
            int c=0;
        int c1=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    c++;
                }
                else{
                    c1++;
                }

            }
            for (int i = m; i >= c; i--) {
                for (int j = n; j >= c1; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - c][j - c1] + 1);
                }
            }
            

        }

        return dp[m][n];
    }
}