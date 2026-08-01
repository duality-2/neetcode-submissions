class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 1)
            return new int[] { nums[0] };
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int l = 0, r = 0;
        while(r < n) {
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[r]) 
                dq.pollLast();
            dq.offerLast(r);

            // remove front if out of window
            if (dq.peekFirst() < l)
                dq.pollFirst();
            
            if(r >= k - 1) {
                result[r -k + 1] = nums[dq.peekFirst()];
                l++;
            }
            r++;
        }
        return result;
    }
}
