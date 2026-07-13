class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int target = -1 * nums[i];
            int k = n - 1;
            int j = i + 1;
            // 2 Ptr Approach
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    list.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                    j++;
                    k--;
                    // skip duplicate j and k
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum > target)
                    k--;
                else
                    j++;
            }
        }
        return list;
    }
}
