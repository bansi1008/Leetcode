class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> res=new ArrayList<>();
         if(n<=2) return res;
    boolean[] prime=new boolean[n+1];
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
         for (int i = 2; i * i <= n; i++) {
        if (prime[i]) {
            for (int j = i * i; j <= n; j += i) {
                prime[j] = false;
            }
        }
    }
for (int x = 2; x <= n / 2; x++) {
            int y = n - x;
            if (prime[x] && prime[y]) {
                res.add(Arrays.asList(x, y));
            }
        }
        return res;

    



    }

   
}