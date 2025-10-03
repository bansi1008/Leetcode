class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        int n=graph.length;
        List<List<Integer>> res=new ArrayList<>();

        Map<Integer, List<Integer>> adj = new HashMap<>();

         for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
            for (int j : graph[i]) {
                adj.get(i).add(j);
            }
        }

            
            List<Integer> path = new ArrayList<>();
             dfs(0, n - 1, adj, path, res);

             return res;



    }

    public void dfs(int node,int target, Map<Integer, List<Integer>> adj,List<Integer> path, List<List<Integer>> res){
        path.add(node);
        if(node==target){
            res.add(new ArrayList<>(path));

        }
        else{
             for (int niegh : adj.get(node)) {
                dfs(niegh, target, adj, path, res);
            }
        }
     
         path.remove(path.size()-1);


    }
}