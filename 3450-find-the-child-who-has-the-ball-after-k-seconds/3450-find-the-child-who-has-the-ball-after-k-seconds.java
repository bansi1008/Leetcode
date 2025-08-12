class Solution {
    public int numberOfChild(int n, int k) {

        int res=1;
     int j=0;
        for(int i=0;i<k;i++){
        j+=res;
        if(j==0||j==n-1){
            res=-res;
        }
            
            

           
        }

        return j;


    }
   
}