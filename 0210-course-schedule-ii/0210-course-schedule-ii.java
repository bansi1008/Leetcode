class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
                         
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for(int i=0;i<numCourses;i++){
            adj.put(i, new ArrayList<>());
        }

        for(int[] edge:prerequisites){
            int a=edge[0],b=edge[1];
            adj.get(b).add(a);
        }
        int[] state=new int[numCourses];
        List<Integer> order = new ArrayList<>();


        for(int i=0;i<numCourses;i++){
            if (state[i] == 0) {
                if (!dfs(i, adj, state, order)) {
                    return new int[0]; 
                }
            }

        }
        Collections.reverse(order);

       
        int[] ans = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            ans[i] = order.get(i);
        }
        return ans;


        
    }

    public static boolean dfs(int node, Map<Integer, List<Integer>> adj, int[] state, List<Integer> order){
       if (state[node] == 1) return false; 
        if (state[node] == 2) return true;  

        state[node] = 1; 

        for (int nei : adj.get(node)) {
            if (!dfs(nei, adj, state, order)) return false;
        }

        state[node] = 2; 
        order.add(node); 
        return true;
    }
}