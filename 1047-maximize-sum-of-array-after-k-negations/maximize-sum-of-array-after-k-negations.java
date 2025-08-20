class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {


        // sort array

        Arrays.sort(nums);

        // negative numbers -> positive

        int index = 0;
        while( k > 0 && index < nums.length && nums[index] < 0){
            nums[index] = Math.abs(nums[index]);
            index++;
            k--;
        }

        // still k > 0 then pick small digit from array multiple times
        if(k>0){
            // sort array to pick first number i.e small number - > convert positive to nagative
            Arrays.sort(nums);

            if(k % 2 == 1){
                nums[0] = - nums[0];
            }
        }

        int sum = 0;
        for(int n : nums){
            sum +=n;
        }
       return sum;
    }
}