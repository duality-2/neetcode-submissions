class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int result = 0;
        for(Integer element: set) {
            int prev = element - 1;
            if(!set.contains(prev)) {
                int currentStreak = 1;
                int next = element + 1;
                while(set.contains(next)) {
                    currentStreak++;
                    next++;
                }
                result = Math.max(result, currentStreak);
            }
        }
        return result;
    }
}
