class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        return freq1.equals(freq2);
    }
}
