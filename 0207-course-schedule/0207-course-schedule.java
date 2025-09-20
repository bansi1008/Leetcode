class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
                 Map<Integer, List<Integer>> adj = new HashMap<>();
                 for(int i=0;i<numCourses;i++){
                    adj.put(i,new ArrayList<>());

                 }

                 for(int[] edge:prerequisites){
                    int f=edge[0],s=edge[1];

                    adj.get(s).add(f );
                 }

                 int[] state = new int[numCourses];
                 for (int i = 0; i < numCourses; i++) {
    if (state[i] == 0) {
        if (!dfs(i, adj, state)) {
            return false; 
        }
    }
}
return true;

        
    }

    boolean dfs(int node, Map<Integer, List<Integer>> adj, int[] state) {
    if (state[node] == 1) return false; 
    if (state[node] == 2) return true;  
    
    state[node] = 1; 
    
    for (int nei : adj.get(node)) {
        if (!dfs(nei, adj, state)) {
            return false; 
        }
    }
    
    state[node] = 2; 
    return true;
}

}