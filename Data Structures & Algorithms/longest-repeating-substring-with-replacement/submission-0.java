class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxFreq = 0, maxLen = 0, n = s.length();
        Map<Character, Integer> freq = new HashMap<>();
        while(r < n) {
            char c = s.charAt(r);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(c)) ;
            while(r - l + 1 - maxFreq > k) {
                // shrink from left
                char leftChar = s.charAt(l);
                freq.put(leftChar, freq.get(leftChar)-1);
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
