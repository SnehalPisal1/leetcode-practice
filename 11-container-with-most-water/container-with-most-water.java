class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int n = height.length;
        
        // Two pointers, one at the beginning, one at the end
        int left = 0, right = n - 1;

        while (left < right) {
            // Calculate the area formed by the lines at the current pointers
            int temp = Math.min(height[left], height[right]) * (right - left);
            
            // Update the maximum area
            if (temp > area) {
                area = temp;
            }

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;  // Move the left pointer towards right
            } else {
                right--; // Move the right pointer towards left
            }
        }
        
        return area;
    }
}
