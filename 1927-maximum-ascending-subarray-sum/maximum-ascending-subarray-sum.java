class Solution {
    public int maxAscendingSum(int[] nums) {

        int currentSum = nums[0];
        int maxSum = currentSum;

        // i < i+1 -> true -> add i till true

        for(int i = 0 ; i < nums.length - 1 ;i++){

            if(nums[i] < nums[i+1]){
             currentSum +=nums[i + 1];

            } else{
               currentSum = nums[i+1];
            }
            System.out.println("currentSum : "+currentSum+"  nums[i + 1] : "+nums[i + 1]);

            maxSum = Math.max(currentSum, maxSum);

            System.out.println("max : "+maxSum);


        }


        
        return maxSum;
    }
}