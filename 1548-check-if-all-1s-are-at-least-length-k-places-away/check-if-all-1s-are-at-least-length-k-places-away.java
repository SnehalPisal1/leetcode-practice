class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int placeCount = k; // Start with k to handle the first 1
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (placeCount < k) {
                    return false;
                }
                placeCount = 0;
            } else {
                placeCount++;
            }
        }
        return true;
    }
}