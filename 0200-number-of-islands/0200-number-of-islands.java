class Solution {
    public int numIslands(char[][] grid) {
        
        int count=0;
        int r=grid.length;
        int c=grid[0].length;
        int[][] visit=new  int[r][c];
       
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' &&visit[i][j]==0){
                    dfs(grid,i,j,visit);
                    count++;
                }
            }

        }
      
        return count;
        

        
    }
    public static void dfs(char[][] nums,int r,int c,int[][] visit){
       int row=nums.length;
       int col=nums[0].length;

       if(r<0|| c<0 || r>=row || c>=col ||  visit[r][c] == 1 || nums[r][c]=='0'){
           return;
       }
       visit[r][c]=1;

       dfs(nums,r+1,c,visit);
       dfs(nums,r-1,c,visit);
       dfs(nums,r,c-1,visit);
       dfs(nums,r,c+1,visit);
    }
}