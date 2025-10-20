class Solution {
    public int maxOperations(int[] nums, int k) {
       Arrays.sort(nums);
    int c=0;
    int l=0;
    int h=nums.length-1;

    while(l<h){
        if(nums[l]+nums[h]>k){
            h--;
        }
        else if(nums[l]+nums[h]<k){
            l++;
        }
        else{
            c++;
            l++;
            h--;
        }
    }
        return c;
    }
}