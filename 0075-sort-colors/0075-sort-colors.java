class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        boolean s;

        for(int i=0;i<n-1;i++){
            s=false;
            for(int j=0;j<n-i-1;j++){
                int temp;
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    s=true;
                }
            }
        }
        
    }
}