class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);

        int prev=Integer.MIN_VALUE;
int c=0;
        for(int num:nums){
            int newval=Math.max(prev+1,num-k);
            if(newval<=num+k){
                prev=newval;
                c+=1;
            }
            
        }
        return c;

        
    }
}