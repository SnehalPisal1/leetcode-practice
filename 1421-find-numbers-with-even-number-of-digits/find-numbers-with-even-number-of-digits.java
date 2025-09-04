class Solution {
    public int findNumbers(int[] nums) {

        //loop
        // count digits in number - > if even - > increment resultcount
        // how to count didgit in number?
        int resultCount =0 ;
        for(int n : nums){
            int digitCount = 0 ;
            while(n>0){
                digitCount++;
                n /=10;
            }

            if(digitCount %2 == 0){
                resultCount++;
            }
        }
        // if odd - > continue
        return resultCount;
    }
}