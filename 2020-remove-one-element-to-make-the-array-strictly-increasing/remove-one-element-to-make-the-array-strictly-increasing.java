class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0; // Count of elements that need to be removed
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            // Check if current element violates the strictly increasing condition
            if (nums[i] <= nums[i - 1]) {
                count++;
                
                // If we've already found more than one violation, return false
                if (count > 1) {
                    return false;
                }
                
                // When we find a violation, we have two choices:
                // 1. Remove nums[i-1] (check if we can keep nums[i])
                // 2. Remove nums[i] (check if we can keep nums[i-1])
                
                // Check if we can remove nums[i-1] by verifying nums[i-2] < nums[i]
                // (only if i >= 2)
                boolean canRemovePrev = (i == 1) || (nums[i - 2] < nums[i]);
                
                // Check if we can remove nums[i] by verifying nums[i-1] < nums[i+1]
                // (only if i < n-1)
                boolean canRemoveCurrent = (i == n - 1) || (nums[i - 1] < nums[i + 1]);
                
                // If we cannot remove either element, return false
                if (!canRemovePrev && !canRemoveCurrent) {
                    return false;
                }
            }
        }
        
        return true;
    }
}