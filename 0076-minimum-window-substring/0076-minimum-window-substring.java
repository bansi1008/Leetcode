class Solution {
    public String minWindow(String s, String t) {
       if (s.length() < t.length()) return "";

        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray())
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);

        int required = targetFreq.size();
        int formed = 0;
        Map<Character, Integer> windowFreq = new HashMap<>();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

            if (targetFreq.containsKey(c) && windowFreq.get(c).intValue() == targetFreq.get(c).intValue())
                formed++;

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if (targetFreq.containsKey(leftChar) && windowFreq.get(leftChar).intValue() < targetFreq.get(leftChar).intValue())
                    formed--;

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    


        
    }
}