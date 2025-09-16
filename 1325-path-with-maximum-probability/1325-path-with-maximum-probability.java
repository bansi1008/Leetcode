class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        Map<Integer, List<double[]>> adj = new HashMap<>();
        for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>());

        }
        for(int i=0;i<edges.length;i++){
            int s=edges[i][0],d=edges[i][1];
            double prob=succProb[i];
             adj.get(s).add(new double[]{d, prob});
            adj.get(d).add(new double[]{s, prob});

        }
            PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
                    pq.offer(new double[]{1.0, start_node});
                      double[] best = new double[n];
                     best[start_node] = 1.0;
                     while(!pq.isEmpty()){
                        double[] cur = pq.poll();
                     double prob = cur[0];
                    int node = (int) cur[1];

                    if(node==end_node) return prob;
                    for (double[] nei : adj.get(node)) {
                int nxt = (int) nei[0];
                double edgeProb = nei[1];

                if (prob * edgeProb > best[nxt]) {
                    best[nxt] = prob * edgeProb;
                    pq.offer(new double[]{best[nxt], nxt});
                }
            }

                     }
                     return 0.0;


        
    }
}