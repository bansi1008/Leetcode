class Solution {
    int c = 0;
    int ans = 0;
    int m, n;
    int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int uniquePathsIII(int[][] grid) {
         m=grid.length;
         n=grid[0].length;

         int sii=0,sij=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                   sii=i;
                   sij=j;

                }
                if(grid[i][j]!=-1){
                    c++;
                }
               
            }
        }
                boolean[][] visited = new boolean[m][n];


        backtrack(grid,visited,sii,sij,1);
        return ans;


    }

    void backtrack(int[][] grid,boolean[][] visited,int i,int j,int curstep){
        if(grid[i][j]==2){
        if(curstep==c){
             ans++;
             return;
        }
        }
        visited[i][j]=true;
        for(int[] d:dirs){
            int nx=i+d[0];
            int ny=j+d[1];

            if(nx<0 || ny<0 || nx>=m || ny>=n || grid[nx][ny]==-1 || visited[nx][ny]==true) continue;
            backtrack(grid,visited,nx,ny,curstep+1);
        }
        visited[i][j] = false;
    }
}