class Solution {
    public int countPairs(int[] deliciousness) {
        int MOD = 1_000_000_007;
        Map<Integer, Integer> freq = new HashMap<>();
        int c = 0;
        
        for (int num : deliciousness) {
           
            for (int i = 0; i <= 21; i++) {
                int p = 1 << i; 
                int sum = p - num;
                c = (c + freq.getOrDefault(sum, 0)) % MOD;
            }
        
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        return c;
    }
}