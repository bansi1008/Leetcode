class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        int i=1;
        int j=0;
        int[] a=new int[s.length()];
        a[0]=0;
        
        while(i<len){
              if(s.charAt(i)==s.charAt(j)){
                j++;
                a[i]=j;
                i++;
                

              }
              else{
                if(j!=0){
                    j=a[j-1];
                }
                else{
                a[i]=0;
                i++;
                }

              }
            
        }

       int lps_last = a[len - 1];
        return (lps_last > 0) && (len % (len - lps_last) == 0);

        
    }
}