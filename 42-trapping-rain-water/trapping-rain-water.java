import java.util.Stack;

class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int water = 0;
        
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int bottom = stack.pop();
                if (stack.isEmpty()) break;
                
                int distance = i - stack.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[bottom];
                water += distance * boundedHeight;
            }
            stack.push(i);
        }
        
        return water;
    }
}