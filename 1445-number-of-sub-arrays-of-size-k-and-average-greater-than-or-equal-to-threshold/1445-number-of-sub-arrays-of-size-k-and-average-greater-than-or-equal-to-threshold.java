class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        if(arr.length<k){
            return 0;
        }

        int curr=0;

        for(int i=0;i<k;i++){
            curr+=arr[i];

        }
        int c=0;
        if(curr/k>=threshold){
            c++;
        }

        for(int i=k;i<arr.length;i++){
            curr+=arr[i]-arr[i-k];
            if(curr/k>=threshold){
                c++;
            }
        }
             return c;
        
    }
}