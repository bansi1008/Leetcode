class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] ans=new int[26];
    for(char s:s1.toCharArray()){
        ans[s-'a']++;
    }
int[] win = new int[26];
    for(int i=0;i<m;i++){
        char c=s2.charAt(i);
        win[c-'a']++;

        if(i>=n){
            win[s2.charAt(i-n)-'a']--;

        }

        if (Arrays.equals(ans, win)) {
                return true;
            }
    }

       
return false;

    }
}