class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length, carry = 0;
        if(digits[n-1] != 9) {
            digits[n-1] = digits[n-1] + 1;
        } else {
            for(int i = n-1; i >= 0; i--) {
                int sum = (i == n - 1) ? (digits[i] + 1) : (digits[i] + carry);
                carry = sum / 10;
                sum = sum % 10;
                digits[i] = sum;
            }
        }
        if(carry != 0) {
            int[] ans = new int[n+1];
            ans[0] = carry;
            digits = ans;
        }

        return digits;
    }
}
