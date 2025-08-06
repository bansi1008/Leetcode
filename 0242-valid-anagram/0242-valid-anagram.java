class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        int[] c=new int[256];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
            c[t.charAt(i)]--;
        }

        for(int n:c){
            if(n!=0){
                return false;
            }

        }
        return true;
        
    }
}