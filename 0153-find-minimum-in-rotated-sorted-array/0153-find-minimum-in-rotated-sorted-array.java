class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int min=0;
        if(nums[l]<=nums[h]){
            return nums[l];
        }
        while(l<h){
            if(nums[l]>=nums[h]){
                min=nums[h];
                h--;

            }
            else{
                l++;
            }

        }
        return min;
    }
}