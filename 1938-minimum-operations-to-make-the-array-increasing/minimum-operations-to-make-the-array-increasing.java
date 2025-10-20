class Solution {
    public int minOperations(int[] nums) {
        // If array has only one element, it's already strictly increasing
        if (nums.length == 1) {
            return 0;
        }
        
        int operations = 0;
        
        // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            // If current element is not greater than previous
            if (nums[i] <= nums[i - 1]) {
                // Calculate how much we need to increment
                int needed = nums[i - 1] + 1;
                int increment = needed - nums[i];
                operations += increment;
                // Update current element to the needed value
                nums[i] = needed;
            }
        }
        
        return operations;
    }
}