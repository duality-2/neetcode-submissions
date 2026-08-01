class Solution {
    public double myPow(double x, int n) {
        return n == 0 ? 1 : (n > 0 ? power(x, n) : 1 / power(x, n));
    }

    private double power(double x, int n) {
        if(n < 0) n *= -1;
        double res = 1;
        for(int i = 1; i <= n; i++) {
            res *= x;
        }
        return res;
    }
}
