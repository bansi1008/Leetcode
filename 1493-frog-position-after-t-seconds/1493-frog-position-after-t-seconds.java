class Solution {
    static double prob=1;
    public double frogPosition(int n, int[][] edges, int t, int target) {
        if (n == 1) return (target == 1) ? 1.0 : 0.0;

       Map<Integer, List<Integer>> adj = new HashMap<>();
      for(int[] e:edges){
       adj.putIfAbsent(e[0], new ArrayList<>());
      adj.putIfAbsent(e[1], new ArrayList<>()); 
       adj.get(e[0]).add(e[1]);
      adj.get(e[1]).add(e[0]);
      }
      Set<Integer> visited = new HashSet<>();


    
     return dfs(t,target,1,adj,visited,1.0);

        
    }

    public double dfs(int t,int target,int node,Map<Integer,List<Integer>> adj,Set<Integer> visited, double prob){
        visited.add(node);
        List<Integer> nieg = adj.get(node);
         int un=0;
        for(int i:nieg){
            if(!visited.contains(i)) un++; 
        }
         if (t == 0 || un == 0) {
            return (node == target) ? prob : 0.0;
        }
        double res=0.0;

        for(int i:nieg){
            if(!visited.contains(i)){
                res+= dfs(t-1,target,i,adj,visited,prob/un);
            }
        }
        return res;


       

    }
}