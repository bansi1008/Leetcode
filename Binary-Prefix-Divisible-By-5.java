class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int c=0;
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i< nums.length;i++){

            c=(c*2 + nums[i]) %5; 
            result.add(c == 0); 



        }
         return result;

        
    }
}