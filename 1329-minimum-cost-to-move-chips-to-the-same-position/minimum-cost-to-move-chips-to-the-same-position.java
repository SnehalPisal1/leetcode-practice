class Solution {
    public int minCostToMoveChips(int[] position) {

        // check with first number
        // if first nuber - ith num is even -> 1
        // odd - > 0

        int evenCount = 0 ;
        int oddCount = 0;
        for(int i = 0 ; i< position.length; i++){
        
            if(position[i] % 2 == 1){
                        oddCount++;
            } else {
                evenCount++;
            }
            

        }
        return Math.min(evenCount, oddCount);
    }
}