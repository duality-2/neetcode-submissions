class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);

        return (slow == 1) ? true : false;
    }
    private int findSquare(int n) {
        int ans = 0;
        while(n > 0) {
            ans += Math.pow(n % 10, 2);
            n /= 10;
        }
        return ans;
    }
}
