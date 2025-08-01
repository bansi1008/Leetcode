class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a=new int[2];

        int l=0;
        int r=numbers.length-1;

        while(l<r){
          int sum=numbers[l]+numbers[r];

            if(sum==target){
                a[0]=l+1;
                a[1]=r+1;
                break;
            }

            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return a;



        
    }
}