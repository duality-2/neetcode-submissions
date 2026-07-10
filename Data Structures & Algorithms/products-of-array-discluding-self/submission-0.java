class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[suffix.length - 1] = 1;

        int prefixProduct = 1;
        for(int i = 0; i <= n - 2; i++) {
            prefixProduct *= nums[i];
            prefix[i+1] = prefixProduct;
        }

        int suffixProduct = 1;
        for(int i = n - 1; i >= 1; i--) {
            suffixProduct *= nums[i];
            suffix[i-1] = suffixProduct;
        }

        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }

}
