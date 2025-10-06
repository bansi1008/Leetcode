class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int cols = heights[0].length;

        boolean[][] visited = new boolean[n][cols];
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0,0});

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int a=curr[0],r=curr[1],c=curr[2];
            if(r==n-1 && c==cols-1) return a;
            if(visited[r][c]) continue;
            visited[r][c]=true;

            for(int[] d:dirs){
                int ar=r+d[0],ac=c+d[1];

                if(ar>=0 && ar<n && ac>=0 && ac<cols && !visited[ar][ac]){
                    int ne=Math.max(a,Math.abs(heights[ar][ac]-heights[r][c]));
                    pq.add(new int[]{ne,ar,ac});
                }
            }
            

        }
        
          return -1;
        
    }
}