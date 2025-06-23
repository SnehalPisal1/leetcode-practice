class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        if(nums.length < 3 ){
            return 0;
        }

        int len = nums.length;
        int max = 0;

        return Math.max( (nums[len-3] * nums[len - 1] * nums[len - 2]),
        (nums[0] * nums[1] * nums[len - 1]));
        


    }
}