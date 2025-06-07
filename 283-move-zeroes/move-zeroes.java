class Solution {
    public void moveZeroes(int[] nums) {

        for(int i=0;i<nums.length ;i++){ // pass

            for(int j=0; j<nums.length -1 ;j++){

                    if(nums[j] == 0 && nums[j+1] != 0){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }

            }
        }
        
    }
}