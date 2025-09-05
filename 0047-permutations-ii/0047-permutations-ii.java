class Solution {

    public void sol(int[] nums, List<Integer> cur, boolean[] used, Set<List<Integer>> res){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;

            cur.add(nums[i]);
            used[i]=true;
            sol(nums,cur,used,res);
             cur.remove(cur.size() - 1);
             used[i] = false;
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        sol(nums,new ArrayList<>(), new boolean[nums.length],res);

        return new ArrayList<>(res);



        
    }
}