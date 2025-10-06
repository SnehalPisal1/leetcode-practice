class Solution {
    public int specialArray(int[] nums) {

        Arrays.sort(nums);
        for(int i = 0 ; i <= nums.length; i++){
            int count = 0;
            int index = 0;
            while(index < nums.length){
                if(nums[index] >= i){
                    count++;
                }
                index++;
            }

            if(i == count){
                return count;
            }

        }
        return -1;
    }}