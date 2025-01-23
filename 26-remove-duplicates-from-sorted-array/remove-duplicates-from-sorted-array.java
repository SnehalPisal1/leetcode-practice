class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // If the array is empty, return 0
        
        int index = 1; // The index to place the next unique element

        // Start from the second element and check for duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // If the current element is different from the previous
                nums[index] = nums[i];  // Place it in the 'index' position
                index++;  // Move the index forward
            }
        }

        // The length of the array without duplicates is the 'index' value
        return index;
    }
}
