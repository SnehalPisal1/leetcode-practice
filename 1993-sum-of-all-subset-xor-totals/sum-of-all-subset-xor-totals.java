class Solution {
    public int subsetXORSum(int[] nums) {
        return generateSubsets(nums, 0, 0);
    }
    
    private int generateSubsets(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }
        
        // Include current element
        int include = generateSubsets(nums, index + 1, currentXOR ^ nums[index]);
        
        // Exclude current element
        int exclude = generateSubsets(nums, index + 1, currentXOR);
        
        return include + exclude;
    }
}