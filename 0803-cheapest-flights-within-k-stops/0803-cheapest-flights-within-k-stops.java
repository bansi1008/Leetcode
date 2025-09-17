class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
         Map<Integer, List<int[]>> adj = new HashMap<>();

         for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>());
         }
         for(int[] edge:flights){
            int s=edge[0],dist=edge[1],cost=edge[2];
            adj.get(s).add(new int[]{dist,cost});
         }
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.offer(new int[]{0,src,0});
        int[][] best = new int[n][k + 2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(best[i], Integer.MAX_VALUE);
        }
        best[src][0]=0;
    while(!pq.isEmpty()){
        int[] cur=pq.poll();
        int cost=cur[0],node=cur[1],stops=cur[2];
        if(node==dst){
            return cost;
        }
        if(stops<=k){
            for(int[] next:adj.get(node)){
                int nie=next[0],price=next[1];
                int nc = cost + price;
                if(nc<best[nie][stops+1]){
                    best[nie][stops+1]=nc;
                pq.offer(new int[]{price+cost,nie,stops+1});
                }
            }
        }
    }



        return -1;
        
    }
}