class Solution {
    public int strStr(String haystack, String needle) {
  int f=-1;
  int j=0;
        for(int i=0;i<needle.length();i++){
            if(haystack.charAt(i)!=needle.charAt(j)){
                 j++;
                
                
               
            }
         
        f=haystack.indexOf(needle);
        return f;
            
        }
        return f;
    }
}