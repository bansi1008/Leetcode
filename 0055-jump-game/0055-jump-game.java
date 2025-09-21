class Solution {
    public boolean canJump(int[] nums) {
        int c=0;
        int f=0;
     

        for(int i=0;i<nums.length;i++){
           
            if(f<i) return false;
             f=Math.max(f,i+nums[i]);

           

        }
       

        return true;
        
    }
}