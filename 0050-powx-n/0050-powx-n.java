class Solution {
    public double pro(double x, long n){
      if (n == 0) return 1.0;

        double half = pro(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
   
    public double myPow(double x, int n) {

       long exp = n; 
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }
        return pro(x, exp);
 
    }
}