class Solution {
    public int maxRotateFunction(int[] nums) {

        
        int f=0;
        int n=nums.length;



        for(int i=0;i<n;i++){
         f+=i*nums[i];
        }
     int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
       
        }
        int max=f;
    
        for(int i=1;i<n;i++){
            f=f+sum-n*nums[n-i];
            max=Math.max(max,f);
        }
return max;
        
    }
}