class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
    
        int r = grid.length;
        int c = grid[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                   
                    int cur = dfs(grid,i,j);
                    max=Math.max(cur,max);
                }
            }

        }
        return max;
        
    }
    public static int dfs(int[][] grid,int r,int c){
    if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
        return 0;
    }
  

    grid[r][c]=0;
    int curval=1;
  curval+= dfs(grid,r+1,c);
     curval+=dfs(grid,r-1,c);
    curval+=dfs(grid,r,c+1);
     curval+=dfs(grid,r,c-1);
return curval;

    }
}