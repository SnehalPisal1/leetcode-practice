class Solution {
    public int pivotIndex(int[] nums) {

        //total sum
       int totalSum=0;

       for(int n: nums){
        totalSum +=n;
       }

       int leftSum=0;

       for(int i =0; i<nums.length;i++){

        int rightSum = totalSum-leftSum-nums[i];

        if(rightSum == leftSum){
            return i;
        }

        leftSum +=nums[i];
       }

        return -1;
    }
}