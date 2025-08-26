class Solution {
    public int rec(int n){
        if(n==1){
            return 1;
        }
       return 2 * (n/2 + 1 - rec(n/2));
     
        
    }
    public int lastRemaining(int n) {
        return rec(n);
    }
}