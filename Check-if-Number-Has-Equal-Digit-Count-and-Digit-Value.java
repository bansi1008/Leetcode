class Solution {
    public boolean digitCount(String num) {
        int[] numArray = new int[num.length()];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            int expectedCount = Character.getNumericValue(num.charAt(i)); 
            if (map.getOrDefault(i, 0) != expectedCount) { 
                return false; 
            }
        }


        return true;

         


        

        



        
    }
}