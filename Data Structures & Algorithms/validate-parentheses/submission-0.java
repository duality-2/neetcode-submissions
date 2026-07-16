class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                s1.push(c);
            else {
                if (s1.isEmpty()) 
                    return false; 

                char top = s1.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return s1.isEmpty();
    }
}
