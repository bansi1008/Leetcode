class Solution {
    public boolean canCross(int[] stones) {
        Map<Integer, Set<Integer>> dp = new HashMap<>();
        int n=stones.length;

        for(int s:stones){
            dp.put(s,new HashSet<>());
        }
        dp.get(0).add(0);

        for(int s:stones){
            Set<Integer> j = dp.get(s);
          for(int k:j){
            for(int i=k-1;i<=k+1;i++){
                if(i>0 && dp.containsKey(i + s)){
                    dp.get(s + i).add(i);
                }
               
            }
          }
 
        }

        return !dp.get(stones[n - 1]).isEmpty();

        
    }
}