class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int w  = 0;
        int s=0;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
             w+=nums[i];

             
                while(w>=target){
                      int c=i-s+1;
                    min=Math.min(min,c);
                    w-=nums[s];
                    s++;

                  
                    
                }
                

          
             
        }
        return (min==Integer.MAX_VALUE)? 0 : min;
        
    }
}