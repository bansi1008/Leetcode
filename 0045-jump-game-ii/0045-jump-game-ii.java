class Solution {
    public int jump(int[] nums) {

       int j=0;
       int c=0;
       int f=0;

       for(int i=0;i<nums.length-1;i++){
        f=Math.max(f,i+nums[i]);

        if(i==c){
            j+=1;
            c=f;
        }
               
       }
        
      return j;
        
    }
}