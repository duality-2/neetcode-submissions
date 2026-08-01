class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, maxLeft = 0, maxRight = 0, sum = 0;
        while (l <= r) {
            if (maxLeft <= maxRight) {
                maxLeft = Math.max(maxLeft, height[l]);
                sum += maxLeft - height[l];
                l++;
            } else {
                maxRight = Math.max(maxRight, height[r]);
                sum += maxRight - height[r];
                r--;
            }
        }
        return sum;
    }
}
