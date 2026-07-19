class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int l = 0, r = s1.length() - 1;

        for(char c: s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for(int i = l; i <= r; i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        while(r < s2.length() - 1) {
            if(Arrays.equals(freq1, freq2)) return true;
            freq2[s2.charAt(l++) - 'a']--;
            freq2[s2.charAt(++r) - 'a']++;
        }
        return Arrays.equals(freq1, freq2);
    }
}
