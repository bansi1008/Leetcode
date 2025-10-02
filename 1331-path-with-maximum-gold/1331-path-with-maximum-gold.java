class Solution {
    public int getMaximumGold(int[][] grid) {
        int t=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    t=Math.max(dfs(grid,i,j),t);

                }
            }
        }
        return t;



        
    }

    public static int dfs(int[][] grid,int i,int j){
        int r=grid.length;
        int c=grid[0].length;
        if(i>=r || i<0 || j<0 || j>=c || grid[i][j]==0){
            return 0;
        }
        int gold = grid[i][j];
        grid[i][j]=0;
        int u=dfs(grid,i-1,j);
        int d=dfs(grid,i+1,j);
        int ri=dfs(grid,i,j+1);
        int l=dfs(grid,i,j-1);

        int m=Math.max(Math.max(u,d),Math.max(ri,l));
        grid[i][j]=gold;

        return gold+m;
        
    }
}