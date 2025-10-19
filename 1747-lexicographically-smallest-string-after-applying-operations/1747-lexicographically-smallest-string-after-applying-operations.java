class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        
         Set<String> seen = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        
        String smallest = s;
        q.offer(s);
        seen.add(s);
        
        while (!q.isEmpty()) {
            String current = q.poll();
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

           
            char[] arr = current.toCharArray();
            for (int i = 1; i < arr.length; i += 2) {
                int digit = (arr[i] - '0' + a) % 10;
                arr[i] = (char) ('0' + digit);
            }
            String added = new String(arr);

           
            String rotated = current.substring(current.length() - b) + current.substring(0, current.length() - b);

           
            if (!seen.contains(added)) {
                seen.add(added);
                q.offer(added);
            }
            if (!seen.contains(rotated)) {
                seen.add(rotated);
                q.offer(rotated);
            }
        }

        return smallest;
    }
}