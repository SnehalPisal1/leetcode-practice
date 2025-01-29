import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length - 1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
               return digits;
            } 
                digits[i] = 0;

        }

         // If we reach here, all digits were 9, so we need to add a new digit at the front
        int[] result = new int[digits.length + 1];
        result[0] = 1; // First digit is 1, rest are already 0 by default
        return result;
    }

}