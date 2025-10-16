class Solution {
    public int maxAscendingSum(int[] nums) {

        // i < i+1 -> sum the numers till i < i+1

        if(nums.length == 1){
            return nums[0];
        }

        int currentSum = nums[0];

        int maxSum = 0;


        for(int i = 0 ;i < nums.length - 1  ;i++){
                 System.out.println("currentSum : "+currentSum);
               maxSum = Math.max(currentSum,maxSum);


                if(nums[i] < nums[i+1]){

                 currentSum += nums[i+1]; 

                } else {

                    currentSum = nums[i+1];
                }

               maxSum = Math.max(currentSum,maxSum);

               System.out.println("max : "+maxSum);

        }
        
        return maxSum;
    }
}