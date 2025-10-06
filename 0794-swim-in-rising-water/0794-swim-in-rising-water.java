class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{grid[0][0],0,0});

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int t=curr[0],r=curr[1],c=curr[2];
            if(r==n-1 && c==n-1) return t;
            if(visited[r][c]) continue;
            visited[r][c]=true;

            for(int[] d:dirs){
               int ri=r+d[0],rc=c+d[1];
               if(ri>=0 && ri<n && rc>=0 && rc<n && !visited[ri][rc]){
                pq.add(new int[]{Math.max(t,grid[ri][rc]),ri,rc});
               }
            }

        }
        return -1;
        
    }
}