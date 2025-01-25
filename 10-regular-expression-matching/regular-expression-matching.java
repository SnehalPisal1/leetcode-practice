import java.util.regex.*;

class Solution {
    public boolean isMatch(String s, String p) {
        // Check if either string is null or empty
        if (s == null || p == null) {
            return false;
        }
        
        // If both strings are empty, they are a match
        if (s.isEmpty() && p.isEmpty()) {
            return true;
        }


        if (Pattern.matches(p, s)) {
            return true;
        } else {
            // If s does not match p, return false
            return false;
        }
    }
}
