class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        
        // Calculate total sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        // Iterate through each index to check if it's a middle index
        for (int i = 0; i < nums.length; i++) {
            // Right sum = total sum - left sum - current element
            int rightSum = totalSum - leftSum - nums[i];
            
            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i;
            }
            
            // Add current element to left sum for next iteration
            leftSum += nums[i];
        }
        
        return -1; // No middle index found
    }
}