class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a =new int[nums.length];
        int j=n;
        int r=0;
        int odd=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
            a[i]=nums[r];
            r++;
           
            }
            else{
                a[i]=nums[j];
                j++;
               
            }
        }
        return a;
        
    }
}