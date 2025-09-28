class Solution {
    public int largestPerimeter(int[] nums) {
     
     Arrays.sort(nums);

     int l=0;
     int r=nums.length-1;

     while(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
     }

     int max=0;

    for(int i=0;i<nums.length-2;i++){
        if(nums[i]<nums[i+1]+nums[i+2]){
          int p=nums[i]+nums[i+1]+nums[i+2];
          max=Math.max(max,p);
        }

    }
    return max;
            
    }
}