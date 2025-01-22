import java.math.BigInteger;

class Solution {
    public int myAtoi(String s) {
        // Step 1: Trim leading and trailing whitespace
        s = s.trim();

        // If the string is empty, return 0
        if (s.isEmpty()) {
            return 0;
        }

        // Step 2: Handle the sign
        int index = 0;
        char sign = '+';
        
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = s.charAt(0);  // Capture the sign
            index++;  // Move to the next character
        }

        // Step 3: Remove leading zeros from the numeric part
        StringBuilder number = new StringBuilder();
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            number.append(s.charAt(index));
            index++;
        }

        // Step 4: If no digits were found, return 0
        if (number.length() == 0) {
            return 0;
        }

        // Step 5: Parse the number string as a BigInteger
        BigInteger result = new BigInteger(number.toString());

        // Step 6: Apply the sign
        if (sign == '-') {
            result = result.negate();
        }

        // Step 7: Handle overflow and underflow
        if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        } else if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        }

        // Step 8: Return the result as an integer
        return result.intValue();
    }
}
