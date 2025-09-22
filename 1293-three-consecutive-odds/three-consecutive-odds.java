class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        // find odd number -> count this odd number check consecustive odds
        // count is 3 - > return true

        int countConsecustiveOdds = 0;
        for(int n : arr){
            //odd
            if(n % 2 != 0){
                countConsecustiveOdds++;
            } else{
                countConsecustiveOdds = 0;
            }

            if(countConsecustiveOdds == 3){
                return true;
            }
        }
        return false;
    }
}