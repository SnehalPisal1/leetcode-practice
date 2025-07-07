class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int longSubseq=0;
        int current = 1;

        if(nums.length < 2){
            return nums.length;
        }

        for(int i=0;i <nums.length - 1;i++){
            if(nums[i] < nums[i+1]){
                current++;
            }
            else{
                current = 1;
            }

            longSubseq = Math.max(longSubseq, current);
        }
        return longSubseq;
    }
}