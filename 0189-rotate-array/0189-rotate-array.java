class Solution {
    public void rotate(int[] nums, int k) {

        int[] a=new int[nums.length];
        int n=nums.length;
        k=k%n;
        

        for(int i=0;i<nums.length;i++){
            int newi=(i+k)%n;
            a[newi]=nums[i];

        }
        for(int i=0;i<n;i++){
            nums[i]=a[i];
        }
      
        
    }
}