class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            adj.put(i, new ArrayList<>());
        }
        for (int[] time : times) {
            int s = time[0], d = time[1], t = time[2];
            adj.get(s).add(new int[] { d, t });

        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[] { 0, k });
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int time = cur[0], node = cur[1];

            if (time > dist[node])
                continue;

            if (adj.containsKey(node)) {
                for (int[] nei : adj.get(node)) {
                    int v = nei[0], w = nei[1];
                    if (dist[node] + w < dist[v]) {
                        dist[v] = dist[node] + w;
                        pq.offer(new int[] { dist[v], v });
                    }
                }
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;
            res = Math.max(res, dist[i]);
        }
        return res;

    }
}