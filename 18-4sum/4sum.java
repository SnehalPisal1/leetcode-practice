import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to facilitate two-pointer technique

        // Iterate through the list for the first element (i)
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Iterate for the second element (j)
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Use two pointers for the third and fourth elements (left, right)
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    // Calculate the sum of the four elements
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];

                    if (sum == target) {
                        // Found a valid quadruple, add it to the result
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the third element (left)
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        // Skip duplicates for the fourth element (right)
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        // Move both pointers after finding a valid quadruple
                        left++;
                        right--;
                    } else if (sum < target) {
                        // If the sum is too small, move the left pointer to the right
                        left++;
                    } else {
                        // If the sum is too large, move the right pointer to the left
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
