class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
   

        int max=0;
        for(int[] e:trips){
            max=Math.max(max,e[2]);
        }


        int[] track=new int[max+1];
       


        for(int[] e:trips){
            int c=e[0];
            int s=e[1];
            int end=e[2];
            track[s]+=c;
            track[end]-=c;

        }
       
       int curr=0;
       for(int c:track){
        curr+=c;

        if(curr>capacity){
            return false;
        }
       }
        return true;
    }
}