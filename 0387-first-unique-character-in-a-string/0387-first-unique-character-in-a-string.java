class Solution {
    public int firstUniqChar(String s) {
        int[] ans=new int[26];
        



        for(char c:s.toCharArray()){
            int i=c-'a';
            ans[i]++;
        }
       

        for(int i=0;i<s.length();i++){
            if(ans[s.charAt(i)-'a']==1) return i;
        
        }
       
     return -1;
        
    }
}