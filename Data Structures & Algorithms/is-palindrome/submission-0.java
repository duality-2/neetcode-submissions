class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char l = s.charAt(start);
            char r = s.charAt(end);
            if (!Character.isLetterOrDigit(l)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                end--;
                continue;
            }

            // 3. If any pair doesn't match, it's not a palindrome
            if (l != r) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
