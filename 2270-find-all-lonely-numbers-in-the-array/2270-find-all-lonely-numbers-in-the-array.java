class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res=new ArrayList<>();

        Arrays.sort(nums);
        int n=nums.length;
        if(n==1){
            res.add(nums[0]);
            return res;
        }
       for(int i=0;i<n;i++){
        if(i==0){
            if(nums[i+1]!=nums[i] && nums[i]+1!=nums[i+1]){
                res.add(nums[i]);

            }
        }
        else if(i==n-1){
            if(nums[i-1]!=nums[i] && nums[i]-1!=nums[i-1]){
                res.add(nums[i]);

            }
        }
        else{
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1] && nums[i]+1!=nums[i+1] && nums[i]-1!=nums[i-1] ){
                res.add(nums[i]);
            }
        }
       }
       
return res;
    }
}