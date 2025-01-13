import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array first to use the two-pointer technique
        int closestSum = Integer.MAX_VALUE; // Initialize the closest sum with a large value
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for i to avoid redundant calculations
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            // Use two-pointer approach to find the closest sum for each `i`
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // If the sum is exactly the target, return the sum immediately
                if (sum == target) {
                    return sum;
                }

                // Update the closest sum if the current sum is closer to the target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                // Move the pointers to get closer to the target
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return closestSum; // Return the closest sum
    }
}
