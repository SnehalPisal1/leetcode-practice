import java.math.BigInteger;

class Solution {
public static int myAtoi(String s) {
    s = s.trim();
    if (s.length() == 0) return 0;
    int sign = 1;
    int i = 0;
    if (s.charAt(0) == '+') {
        sign = 1;
        i++;
    } else if (s.charAt(0) == '-') {
        sign = -1;
        i++;
    }
    int number = 0;
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';
        if (number > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        number = number * 10 + digit;
        i++;
    }
    return sign * number;
}
}
