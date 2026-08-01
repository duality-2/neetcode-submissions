class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0, n = heights.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int poppedIndex = stack.pop();
                int ncsIndex = i;
                int pcsIndex = stack.isEmpty() ? -1 : stack.peek();
                int area = heights[poppedIndex] * (ncsIndex - pcsIndex - 1);
                max = Math.max(max, area);
            }
            stack.push(i); 
        }
        while(!stack.isEmpty()) {
            int ncsIndex = n;
            int poppedIndex = stack.pop();
            int pcsIndex = stack.isEmpty() ? -1 : stack.peek();
            int area = heights[poppedIndex] * (ncsIndex - pcsIndex - 1);
            max = Math.max(max, area);
        }
        return max;
    } 
}