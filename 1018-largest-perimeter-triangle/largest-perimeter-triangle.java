public class Solution {
    public int largestPerimeter(int[] nums) {
        //sort array
        Arrays.sort(nums);
        for (int i = nums.length - 3; i >= 0; --i) {
            if (nums[i] + nums[i+1] > nums[i+2]) {
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        // if not found return 0
        return 0;
    }
}
