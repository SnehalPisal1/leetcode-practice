import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        Set<List<Integer>> uniqueTriplets = new HashSet<>(); // Set to ensure uniqueness

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Loop through the array to fix the first element
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first pointer (nums[i])
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Use two pointers to find the other two numbers
            while (left < right) {
                int add = nums[i] + nums[left] + nums[right];

                if (add < 0) {
                    left++;
                } else if (add > 0) {
                    right--;
                } else {
                    // Found a valid triplet
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);

                    // Add to the set of unique triplets
                    uniqueTriplets.add(triplet);

                    // Skip duplicates for the second pointer (nums[left])
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the third pointer (nums[right])
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move the pointers after adding a valid triplet
                    left++;
                    right--;
                }
            }
        }

        // Convert the set back to a list
        finalList.addAll(uniqueTriplets);

        return finalList;
    }
}
