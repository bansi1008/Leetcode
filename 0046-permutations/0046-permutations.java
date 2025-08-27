class Solution {
    public void sol(int[] nums, List<Integer> cur, boolean[] used, List<List<Integer>> res){
     if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur)); 
            return;
        }

       
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; 

            
            cur.add(nums[i]);
            used[i] = true;

          
            sol(nums, cur, used, res);

           
            cur.remove(cur.size() - 1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
               List<List<Integer>> res = new ArrayList<>();
            sol(nums, new ArrayList<>(), new boolean[nums.length], res);
         return res;

        


        
    }
}