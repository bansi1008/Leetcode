class Solution {
    public boolean isPalindrome(String s) {
        String a=s.replaceAll("[\\s\\p{Punct}]+", "").toLowerCase();
       int l=0;
       int r=a.length()-1;

       while(l<=r){
        if(a.charAt(l)!=a.charAt(r)){
            return false;
        }
        l++;
        r--;
       }
       return true;

        
    }
}