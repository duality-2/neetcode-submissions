class Solution {
    public double myPow(double x, int n) {
        return n == 0 ? 1 : (n > 0 ? power(x, n) : 1 / power(x, n));
    }

    private double power(double x, int n) {
        if(n < 0) n *= -1;
        if(n == 0) return 1;
        if(n % 2 == 0) {
            double half = power(x, n/2);
            return half * half;
        }
        else {
            return x * power(x, n - 1);
        }
    }
}