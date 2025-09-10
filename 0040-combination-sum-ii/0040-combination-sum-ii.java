class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),candidates,target,0);
        
        return res;




        
    }
    public static void backtrack(List<List<Integer>> res,List<Integer> curr,int[] nums,int remain,int start){
        if(remain==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if (remain < 0) return;

        for(int i=start;i<nums.length;i++){
            if (i > start && nums[i] == nums[i - 1]) continue;
            curr.add(nums[i]);
            backtrack(res,curr,nums,remain-nums[i],i+1);
            curr.remove(curr.size()-1);

        }
    }
}