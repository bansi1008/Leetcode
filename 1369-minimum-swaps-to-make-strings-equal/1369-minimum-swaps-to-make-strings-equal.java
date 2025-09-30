class Solution {
    public int minimumSwap(String s1, String s2) {
        int n=s1.length();

        int a=0,b=0;

        for(int i=0;i<n;i++){
            int j=s1.charAt(i),k=s2.charAt(i);

            if(j=='x' && k=='y') a++;
            if(j=='y' && k=='x') b++;
        }
  if((a+b)%2!=0)  return -1;

  int s=a/2+b/2+(a%2)*2;

  return s;


        
    }
}