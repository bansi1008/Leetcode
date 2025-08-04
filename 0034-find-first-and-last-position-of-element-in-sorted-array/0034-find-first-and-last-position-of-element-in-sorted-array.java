class Solution {

    public static int first(int[] a,int target){
        int low=0;
        int high=a.length-1;
        int result=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                result=mid;
                high=mid-1;

            }
            else if(a[mid]<target){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return result;
    }

    public static int sec(int[] a,int target){
        int low=0;
        int high=a.length-1;
        int result=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                result=mid;
                low=mid+1;

            }
            else if(a[mid]<target){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public int[] searchRange(int[] nums, int target) {

        int a=first(nums,target);
        int b=sec(nums,target);

        return new int[]{a,b};
       
    }
}