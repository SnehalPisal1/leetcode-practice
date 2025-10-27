class Solution {
    public int maxProductDifference(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        // sort array

        Arrays.sort(nums);

        // get max 2  and min 2 elements 

        int min = nums[0] * nums[1];
        int max = nums[nums.length - 1] * nums[nums.length - 2];

        return max - min;
        
    }
}