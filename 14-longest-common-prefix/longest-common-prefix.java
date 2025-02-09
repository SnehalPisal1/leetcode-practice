class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];  // Start with the first string as the prefix

        // Loop through the array starting from the second string
        for (int i = 1; i < strs.length; i++) {
            // While the current string doesn't start with the prefix, reduce the prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If there's no common prefix, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
