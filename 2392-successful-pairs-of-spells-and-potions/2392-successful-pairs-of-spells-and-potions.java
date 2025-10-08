class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int m=spells.length;
        int n=potions.length;
        int[] ans= new int[m];
        

        Arrays.sort(potions);

        for(int i=0;i<m;i++){
                 int curr=spells[i];
                 int l=0;
                 int h=n-1;
                 int id=n;


                 while(l<=h){
                    int mid=(l+h)/2;
                    if((long)potions[mid]*curr>=success){
                        h=mid-1;
                        id=mid;
                      
                    }
                    else{
                        l=mid+1;
                    }
                 }
                 ans[i]=n-id;



        }


 return ans;
        
    }
}