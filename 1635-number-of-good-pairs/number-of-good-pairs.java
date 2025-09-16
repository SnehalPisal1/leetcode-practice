class Solution {
    public int numIdenticalPairs(int[] nums) {

        int noGoodPairs = 0;

        //iterate loop -> need to check each element to its subsequent elements for there

        for(int i = 0; i < nums.length;i++){
            for(int j = i+1 ; j< nums.length ;j++){
                if(nums[i] == nums[j]){
                    noGoodPairs++;
                }
            }
        }
        

     
        return noGoodPairs;
      
    }
}