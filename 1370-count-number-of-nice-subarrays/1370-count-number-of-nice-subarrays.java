class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l=0;
        int c=0;
        int slen=0;

        for(int r=0;r<nums.length;r++){
           
           if(nums[r]%2!=0){
            slen++;
        
           }

               while(slen>k){
                if(nums[l]%2!=0){
                     slen--;

                }
               
                l++;
            
           }

             if (slen == k) {
                int tempLeft = l;
               
                while (tempLeft < nums.length && nums[tempLeft] % 2 == 0) {
                    tempLeft++;
                }

           c+= tempLeft - l + 1;
             }
           


           



        }

        return c;
    }
}