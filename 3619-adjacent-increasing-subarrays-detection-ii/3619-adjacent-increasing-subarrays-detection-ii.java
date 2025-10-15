class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int h=n/2;
        int l=0;

        int[] a=new int[n];
        a[n-1]=1;

         for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                a[i] = a[i + 1] + 1;
            } else {
                a[i] = 1;
            }
        }
        

      while(l<=h){
        int k=(h+l)/2;
       boolean c= check(k,a,n);

       if(c==true){
        l=k+1;
        
       }
       else{
        h=k-1;
       
       }
      }
        
        return h;
    }

    public boolean check(int k,int[] a,int n){
       for (int i = 0; i <= n - 2 * k; i++) {
            if (a[i] >= k && a[i + k] >= k) {
                return true;
            }
        }
        return false;
    }
}
