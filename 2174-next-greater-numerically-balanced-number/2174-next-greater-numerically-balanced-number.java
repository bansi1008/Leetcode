class Solution {
       private static boolean b(int x) {
        String s = String.valueOf(x);
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) m.put(c, m.getOrDefault(c, 0) + 1);
        for (char c : m.keySet()) if (m.get(c) != c - '0') return false;
        return true;
    }
    public int nextBeautifulNumber(int n) {
        int c = n + 1;
        while (!b(c)) c++;
        return c;
    }
}