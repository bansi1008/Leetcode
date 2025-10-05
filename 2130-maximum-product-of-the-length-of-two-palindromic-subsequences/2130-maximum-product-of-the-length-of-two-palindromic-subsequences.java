class Solution {
    public int maxProduct(String s) {
        int len = s.length();
        int t = 1 << len;
        int[] m = new int[t];

        
        for (int i = 1; i < t; i++) {
            StringBuilder sub = new StringBuilder();

            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0) {
                    sub.append(s.charAt(j));
                }
            }

            if (checkPla(sub.toString())) { 
                m[i] = sub.length();
            }
        }

       
        int max = 0;
        for (int i = 1; i < t; i++) {
            if (m[i] == 0) continue;

            for (int j = i + 1; j < t; j++) {
                if (m[j] == 0) continue;

                if ((i & j) == 0) { 
                    max = Math.max(max, m[i] * m[j]);
                }
            }
        }

        return max;
    }

    private boolean checkPla(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false; 
        }

        return true;
    }
}
