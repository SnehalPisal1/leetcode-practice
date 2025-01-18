class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0; // To track the starting index of the longest palindrome
        int maxLength = 1; // Minimum palindrome length is 1 (a single character)

        // Expand around every character
        for (int i = 0; i < s.length(); i++) {
            // Check odd-length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Check even-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);

            // Find the longer palindrome between odd and even
            int len = Math.max(len1, len2);
            if (len > maxLength) {
                maxLength = len; // Update the length of the longest palindrome
                start = i - (maxLength - 1) / 2; // Update the starting index of the palindrome
            }
        }

        return s.substring(start, start + maxLength); // Return the longest palindrome substring
    }

    // Helper function to expand around the center and check the palindrome length
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; // Move left pointer outwards
            right++; // Move right pointer outwards
        }
        return right - left - 1; // The length of the palindrome
    }
}
