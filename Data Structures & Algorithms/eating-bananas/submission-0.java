class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = getMax(piles), result = 0;
        int start = 1, end = max;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (totalHours(piles, mid) <= h) {
                result = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return result;
    }

    private int getMax(int[] arr) {
        int max = 0;
        for (int i : arr) max = Math.max(max, i);
        return max;
    }
    private int totalHours(int[] arr, int k) {
        int sum = 0;
        for (int p : arr) {
            sum += Math.ceil((double) p / k);
        }
        return sum;
    }
}
