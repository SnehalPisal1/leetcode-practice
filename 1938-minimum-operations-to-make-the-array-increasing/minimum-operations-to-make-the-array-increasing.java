class Solution {
    public int minOperations(int[] nums) {

        int count = 0;
        int length =  nums.length;

       for(int i = 1 ; i < length;i++){

            if(nums[i] <= nums[i-1]){

                int increment = nums[i - 1] + 1;

                count += increment - nums[i];

                nums[i] = increment;

                System.out.println(i + " : " +nums[i]);

            }


       }

      return count; 
        
    }
}