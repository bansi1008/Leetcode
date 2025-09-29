class Solution {
    public int countArrangement(int n) {
        boolean[] used = new boolean[n + 1]; 
        int[] count = new int[1];           
        sol(1, n, used, count);             
        return count[0];
    }

   
    public void sol(int pos, int n, boolean[] used, int[] count) {
        if (pos > n) {           
            count[0]++;        
            return;
        }

        for (int num = 1; num <= n; num++) {
            
            if (!used[num] && (num % pos == 0 || pos % num == 0)) {
                used[num] = true;          
                sol(pos + 1, n, used, count); 
                used[num] = false;         
            }
        }
    }
}
