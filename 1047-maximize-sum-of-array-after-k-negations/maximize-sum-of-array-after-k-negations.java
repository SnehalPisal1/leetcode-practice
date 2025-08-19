class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {


        // sort it 

        // convert negative  -> positive number

        // still k > 0 or only postive numbers in array then change single num multiple times 

        Arrays.sort(nums);

        int index =0;
        while(k>0 && index < nums.length && nums[index] < 0){

                nums[index] = Math.abs(nums[index]);
                k--;
                index++;
        }

        if(k > 0){
            // k is odd - > it will change to negative 

            Arrays.sort(nums);
            if( k % 2 == 1){
                 nums[0] = -nums[0];
            }
        }

     
        int sum = 0;
        for(int n : nums){
            sum +=n;
        }
       return sum;
    }
}