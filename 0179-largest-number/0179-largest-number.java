class Solution {
    public String largestNumber(int[] nums) {
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(res,(a,b)->(b+a).compareTo(a+b));
        if (res[0].equals("0")) return "0";
         StringBuilder sb = new StringBuilder();
        for (String s : res) sb.append(s);

        return sb.toString();
    }
}