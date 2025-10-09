class Solution {
    public long minTime(int[] skill, int[] mana) {
    int n = skill.length;
        int m = mana.length;
        long[] cum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            cum[i + 1] = cum[i] + skill[i];
        }
        long total = cum[n];
        long ans = (long) mana[0] * total;
        long prevS = 0;
        for (int j = 1; j < m; j++) {
            long maxS = 0;
            long prevMana = mana[j - 1];
            long currMana = mana[j];
            for (int i = 0; i < n; i++) {
                long cand = prevS + prevMana * cum[i + 1] - currMana * cum[i];
                if (cand > maxS) {
                    maxS = cand;
                }
            }
            prevS = maxS;
            long comp = maxS + currMana * total;
            if (comp > ans) {
                ans = comp;
            }
        }
        return ans;
    }
}