class Solution {
    public int[] runningSum(int[] nums) {

        int result[] = new int[nums.length];
        int sum = 0;
        int index = 0;
        for(int n: nums){
            sum +=n;
            result[index++] = sum;
        }

        return result;
        
    }
}