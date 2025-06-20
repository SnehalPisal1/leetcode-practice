class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutiveOnes = 0 ;
        int consecutiveOnes = 0;
        for ( int n: nums){

                if( n == 1){
                consecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
                } else {
                 consecutiveOnes=0;
                }


        }
     return maxConsecutiveOnes;   
    }
}