class Solution {

   public static Map<Integer, Integer> memo = new HashMap<>();


    public int numTrees(int n) {
        
        if (n <= 1) return 1;
    if (memo.containsKey(n)) return memo.get(n);

    int total = 0;
    for (int i = 1; i <= n; i++) {
        total += numTrees(i - 1) * numTrees(n - i);
    }

    memo.put(n, total);
    return total;


    }
}