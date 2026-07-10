class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        boolean result = false;
        for(int num: nums) {
            if(!hashSet.add(num)) result = true;
        }
        return result;
    }
}
