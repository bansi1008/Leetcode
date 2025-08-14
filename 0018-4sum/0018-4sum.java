class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

       Arrays.sort(nums);
       List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if (j > i+1 && nums[j] == nums[j - 1]) continue;
             
                int l=j+1;
                int r=nums.length-1;
                while(l<r){
                    long sum =(long) nums[i] + nums[j] + nums[l] + nums[r];

                    if(sum<target){
                        l++;
                    }
                    else if(sum>target){
                        r--;
                    }
                    else{
                        List<Integer> group = new ArrayList<>();
                    group.add(nums[i]);
                    group.add(nums[j]);
                    group.add(nums[l]);
                    group.add(nums[r]);
                    li.add(group);

                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                    }
                }

            }
        }

        return li;
    }
}