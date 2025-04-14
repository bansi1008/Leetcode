class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n; 

        int first = 1, second = 2, w = 0;
        
        for (int i = 3; i <= n; i++) {
            w = first + second; 
            first = second; 
            second = w;
        }
        
        return w;
        
    }
}