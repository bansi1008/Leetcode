class Solution {
    public int characterReplacement(String s, int k) {
         
        int[] n=new int[26];
        int l=0,frq=0,res=0;

        for(int i=0;i<s.length();i++){
            n[s.charAt(i)-'A']++;
            frq=Math.max(frq,n[s.charAt(i)-'A']);

            while(i-l+1-frq>k){
                 n[s.charAt(l)-'A']--;
                 l++;
            }

            res=Math.max(res,i-l+1);
        }
        return res;
    }
}