class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        
        if(nums.length<k){
            int sum=0;
            double z=0;
            for(int i=0;i<nums.length;i++){
                sum += nums[i];
                    z=sum/k;
            }
            return z;
        }
        double c=0;
        double sum=0;
         for(int i=0;i<k;i++){
            sum +=nums[i];
            c=sum/k;
         }
          double a=c;
         for(int i=k;i<nums.length;i++){
           sum=sum+nums[i]-nums[i-k];
           c=sum/k;
           a=Math.max(a,c);

         }
         return a;

        
    }
}