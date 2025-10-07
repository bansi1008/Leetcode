class Solution {
    public static long hours(int[] piles, int k) {
        long h = 0;
        for (int p : piles) {

            h += (p +(long) k - 1) / k;
        }
        return h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int l = 1;
        int hi = 0;

        for (int p : piles) {
            hi = Math.max(p, hi);
        }
        int res = hi;
        while (l <= hi) {
            int mid = l + (hi - l) / 2;

            long hourss = hours(piles, mid);
            if (hourss <= h) {
                res = mid;
                hi = mid - 1;

            } else {
                l = mid + 1;
            }

        }
        return res;

    }
}
