class Solution {
    public int findGCD(int[] nums) {

        // sort array first
        Arrays.sort(nums);

        int smallNo = nums[0];
        int largeNo = nums[nums.length - 1];

        for(int i = smallNo ; i > 0 ;i--){

            if((largeNo % i) == 0 && (smallNo % i) == 0){
                return i;
            }
        }
        return 0;
    }
}