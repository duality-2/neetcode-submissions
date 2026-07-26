class Solution {
    public int rob(int[] nums) {
        int n = nums.length, pick = 0, notPick = 0, prev = nums[0], prev2 = 0, current = 0;

        for(int i = 1; i < n; i++) {
            pick = nums[i]; 
            if(i > 1) {
                pick += prev2;
            }
            notPick = 0 + prev;

            current = Math.max(pick, notPick);
            prev2 = prev;
            prev = current;
        }

        return prev;
    }
}
