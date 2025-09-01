class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

          Arrays.sort(boxTypes, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return b[1] - a[1]; 
            }
        });
   

        int t=0;
        int r=truckSize;

        for(int[] a:boxTypes){
            int box=Math.min(a[0],r);
            t+=box*a[1];
            r-=box;
            if(r==0) break;
        }


        
return t;
        
    }
}