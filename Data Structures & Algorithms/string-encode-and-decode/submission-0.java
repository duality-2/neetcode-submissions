class Solution {

    public String encode(List<String> strs) {
        String result = new String();
        for(String str: strs) {
            result = result + str.length() + '#' + str;
        }
        return result;
    }

    public List<String> decode(String s) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') j++;  // scan until you hit '#'
            
            int length = Integer.parseInt(s.substring(i, j));  // extract the number
            String word = s.substring(j + 1, j + 1 + length); // extract the word
            i = j + 1 + length;                                // move to next encoded word

            list.add(word);
        }

        return list;   
    }
}
