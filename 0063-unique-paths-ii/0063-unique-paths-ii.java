class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
       int n=obstacleGrid[0].length;
       int[] dp=new int[n+1];
       int c=0;
       int prevc=0;
       int prevr=0;

       Arrays.fill(dp,0);

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(obstacleGrid[i][j]==1){
                dp[j] = 0;
                continue;
            }
            if(i==0 && j==0){
              dp[j]=1;
               

                continue;
            }
            int up=(j>0) ?dp[j-1]:0;
            int left=dp[j];

            c=up+left;
            dp[j]=c;

        }
        
       }
       
   return dp[n-1];
}
}

//     int m=obstacleGrid.length;
     /*   int n=obstacleGrid[0].length;
       
      return  dfs(obstacleGrid,m-1,n-1);
        
    }

    public int dfs(int[][] obstacleGrid,int i,int j){
        if(i<0 || j<0 ){
          
            return 0;
        }
        if(obstacleGrid[i][j] == 1) return 0;
        if(i==0 && j==0) return 1;

       int up= dfs(obstacleGrid,i-1,j);
       int down=dfs(obstacleGrid,i,j-1);

       return up+down;


    }


        int m=obstacleGrid.length;
       int n=obstacleGrid[0].length;
       int[][] dp=new int[m][n];
       int c=0;
       int prevrc=0
       int prevr=0

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(obstacleGrid[i][j]==1){
                continue;
            }
            if(i==0 && j==0){
                dp[i][j]=1;
                continue;
            }
            int up=(i>0) ?dp[i-1][j]:0;
            int left=(j>0)?dp[i][j-1]:0;

            dp[i][j]=up+left;
        }
       }
       
   return dp[m-1][n-1];
    */
    