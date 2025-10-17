class Solution {
    public boolean checkPowersOfThree(int n) {
       while(n>0){
        int mod=n%3;
        if(mod==2){
            return false;
        }
        n/=3;
       }
       return true;
    }
}