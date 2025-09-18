class Solution {
    int[] ans, subtreeSize;
    Map<Integer, List<Integer>> adj;
    int n;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.n = n;
        ans = new int[n];
        subtreeSize = new int[n];
        adj = new HashMap<>();

        for (int i = 0; i < n; i++) adj.put(i, new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        dfs1(0, -1, 0);

        dfs2(0, -1);

        return ans;
    }

    private void dfs1(int node, int parent, int depth) {
        ans[0] += depth;   
        subtreeSize[node] = 1;

        for (int nei : adj.get(node)) {
            if (nei == parent) continue;
            dfs1(nei, node, depth + 1);
            subtreeSize[node] += subtreeSize[nei];
        }
    }

    private void dfs2(int node, int parent) {
        for (int nei : adj.get(node)) {
            if (nei == parent) continue;

            ans[nei] = ans[node] - subtreeSize[nei] + (n - subtreeSize[nei]);

            dfs2(nei, node);
        }
    }
}
