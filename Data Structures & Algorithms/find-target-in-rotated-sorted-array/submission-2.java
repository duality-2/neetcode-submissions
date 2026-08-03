class Solution {
    public int search(int[] nums, int target) {
        int min = findMin(nums);
        if(target == nums[min]) return min;
        int start = 0, end = nums.length - 1;
        if(min == 0) {
            start += 0;
            end += 0;
        }
        // target > nums[min];
        else if(target > nums[nums.length - 1]) {
            // search in left
            end = min - 1;
        } else {
            // search in right
            start = min + 1;
        }
        return binarySearch(nums, start, end, target);
    }
    private int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, result = Integer.MAX_VALUE;
        int index = 0;
        while(start <= end) {
            if(nums[start] < nums[end]) {
                result = Math.min(result, nums[start]);
                break;
            }
            int mid = start + ((end - start) / 2);
            result = Math.min(result, nums[mid]);
            index = mid;
            if(nums[start] <= nums[mid]) start = mid+1;
            else end = mid-1;
        }
        return result == nums[0] ? 0 : index;
    }
    private int binarySearch(int[] nums, int s, int e, int target) {
        while(s <= e) {
            int mid = s + ((e - s) / 2);  
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
}
