class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        int have = 0;
        Map<Character, Integer> tFreq = new HashMap<>();
        Map<Character, Integer> windowFreq = new HashMap<>();

        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }
        int need = tFreq.size();

        int l = 0, r = 0, n = s.length(), minLen = Integer.MAX_VALUE;
        while (r < n) {
            char c = s.charAt(r);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);
            if (tFreq.containsKey(c) && windowFreq.get(c).equals(tFreq.get(c)))
                have++;
            while(have == need) {
                if(r - l + 1 < minLen) result = s.substring(l, r+1);
                minLen = Math.min(minLen, r - l + 1);
                char sl = s.charAt(l);
                windowFreq.put(sl, windowFreq.get(sl) - 1);
                if(tFreq.containsKey(sl) && windowFreq.get(sl) < tFreq.get(sl)) have--;
                l++;
            }
            r++;
        }
        return result;
    }
}
