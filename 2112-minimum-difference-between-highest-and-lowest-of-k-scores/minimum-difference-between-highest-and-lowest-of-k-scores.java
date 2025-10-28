import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }
        
        // Sort the array - THIS IS CRUCIAL
        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;
        
        // Calculate initial window
        int initialDiff = nums[k - 1] - nums[0];
        minDiff = Math.min(minDiff, initialDiff);
        
        // Slide the window
        for (int i = k; i < nums.length; i++) {
            int currentDiff = nums[i] - nums[i - k + 1];
            minDiff = Math.min(minDiff, currentDiff);
        }
        
        return minDiff;
    }
}