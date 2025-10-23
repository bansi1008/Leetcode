class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
       
        int n=grid.length;
        int c=n/2;
         int yv=0;
         int nyv=0;
   int[] y=new int[3];
   int[] ny=new int[3];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if((i<=c && i==j)|| (i<=c && i+j==n-1) || (i>=c && j==c)){
                    y[grid[i][j]]++;
                    yv++;


               }
               else{
                ny[grid[i][j]]++;
                nyv++;
               }

               
            }
        }

                int ans = Integer.MAX_VALUE;

 for(int i=0;i<=2;i++){
    for(int j=0;j<=2;j++){
   if(i==j) continue;
   int oy=yv-y[i];
   int ony=nyv-ny[j];

   ans=Math.min(ans,oy+ony);
    }
 }
          
return ans;
    }
}