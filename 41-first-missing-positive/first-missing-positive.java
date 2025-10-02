class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // First pass: Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            // While the current number is positive, within range [1, n],
            // and not already in its correct position
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        // Second pass: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all numbers 1..n are present, return n + 1
        return n + 1;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}