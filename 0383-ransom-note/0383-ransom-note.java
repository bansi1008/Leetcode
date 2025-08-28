class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a=new int[26];
        for(char c:ransomNote.toCharArray()){
            a[c-'a']++;
        }

         for(char c:magazine.toCharArray()){
            a[c-'a']--;
        }

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                return false;
            }
        }
          
        return true;
    }
}