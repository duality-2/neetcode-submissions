class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operator = "";
        int num1 = 0;
        int num2 = 0;

        for(String token: tokens) {
            if(token.matches("-?\\d+"))
                stack.push(Integer.parseInt(token));
            else {
                num2 = stack.pop();
                num1 = stack.pop();
                int ans = calculate(num1, num2, token);
                stack.push(ans);
            }
        }
        return stack.peek();
    }
    private int calculate(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1* num2;
            case "/" -> num1 / num2;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
