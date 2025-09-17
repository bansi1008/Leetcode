class Solution {
    public int minCostConnectPoints(int[][] points) {
      
        int n = points.length;
        boolean[] visited = new boolean[n];
        int usededge = 0;
        int cost = 0;
                
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0,0});
        while(usededge<n){
            int[] cur=pq.poll();
            int d=cur[0],node=cur[1];
            if (visited[node]) continue;
            visited[node] = true;
            cost+=d;
            usededge++;
            for(int i=0;i<n;i++){
                if(!visited[i]){
                    int dist = Math.abs(points[node][0] - points[i][0]) +
                               Math.abs(points[node][1] - points[i][1]);
                    pq.offer(new int[]{dist, i});
                }
            }
        }

       return cost; 
    }
}