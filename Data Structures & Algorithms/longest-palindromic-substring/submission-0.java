class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String result = "";
        int left = 0, right = 0, n = s.length();
        for(int i = 0; i < n; i++) {
            // Odd Case
            left = i; right = i;
            while(left >= 0 && right < n && s.charAt(right) == s.charAt(left)) {
                int currentLen = right - left + 1;
                if(currentLen > maxLen) {
                    result = s.substring(left, right + 1);
                    maxLen = currentLen;
                }
                left--;
                right++;
            }

            // Even Case
            left = i; right = i + 1;
            while(left >= 0 && right < n && s.charAt(right) == s.charAt(left)) {
                int currentLen = right - left + 1;
                if(currentLen > maxLen) {
                    result = s.substring(left, right + 1);
                    maxLen = currentLen;
                }
                left--;
                right++;
            }
        }
        return result;
    }
}
