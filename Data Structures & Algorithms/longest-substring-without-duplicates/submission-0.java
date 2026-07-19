class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0, r = 0, max = 0;
        while(r < s.length()) {
            char c = s.charAt(r++);
            while(set.contains(c)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);

            max = Math.max(max, r - l) ;
        }
        return max;
    }
}
