class Solution {

    public List<String> letterCombinations(String digits) {
        // Mapping of digits to letters.
        String[] digitToChar = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        // List to store the result combinations.
        List<String> result = new ArrayList<>();
        
        // If the input string is empty, return an empty list.
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Initialize a StringBuilder for constructing combinations
        StringBuilder current = new StringBuilder();
        
        // Backtracking
        List<String> queue = new ArrayList<>();
        queue.add("");  // Start with an empty string

        // Process each digit in the input
        for (char digit : digits.toCharArray()) {
            int digitIndex = digit - '0'; // Convert char to corresponding index
            String letters = digitToChar[digitIndex];
            
            // For each combination so far, append each letter of the current digit
            List<String> newQueue = new ArrayList<>();
            for (String combination : queue) {
                for (char letter : letters.toCharArray()) {
                    newQueue.add(combination + letter);
                }
            }
            
            // Move to the next digit
            queue = newQueue;
        }

        // The queue now contains all possible combinations
        return queue;
    }


}






