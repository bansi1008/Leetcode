class Solution {
    public int removeElement(int[] nums, int val) {
       if (nums.length == 0) return 0;

        int j=0;
                                         //[3,2,2,3], val = 3

        for(int i=0; i<nums.length;i++){
            if(nums[i] != val){
                nums[j]=nums[i];
                j++;
                
            }
        }
        return j;

        
    }
}