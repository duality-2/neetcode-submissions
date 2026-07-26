class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int first = helper(nums, n - 2);
        int last = helper(nums, n - 1);
        return Math.max(first, last);

    }

    private int helper(int[] nums, int end) {
        int n = nums.length, prev2 = 0, prev = 0;
        if (end == n - 2)
            prev = nums[0];
        for (int i = 1; i <= end; i++) {
            int pick = nums[i];
            if (i > 1)
                pick += prev2;
            int notPick = 0 + prev;

            int current = Math.max(pick, notPick);
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
}
