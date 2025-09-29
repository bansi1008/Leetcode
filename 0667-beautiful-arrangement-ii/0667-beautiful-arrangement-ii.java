class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int i = 0;

        
        for (; i < n - k - 1; i++) {
            res[i] = i + 1;
        }

       
        int low = i + 1;
        int high = n;
        boolean turnHigh = true;

        while (i < n) {
            if (turnHigh) {
                res[i++] = low++;
            } else {
                res[i++] = high--;
            }
            turnHigh = !turnHigh;
        }

        return res;
    }
}
