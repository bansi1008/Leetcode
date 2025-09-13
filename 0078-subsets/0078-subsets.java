class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        backt(res,nums,0,new ArrayList<>());
        return res;
        
    }
  public static void  backt(List<List<Integer>> res,int[] nums,int start,List<Integer> cur){
        res.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            backt(res,nums,i+1,cur);
            cur.remove(cur.size()-1);
        }
    }
}