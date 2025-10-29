class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Convert to 0-indexed for easier calculation
            
            // Get the current character (0-25 maps to A-Z)
            char c = (char) ('A' + columnNumber % 26);
            sb.append(c);
            
            // Move to the next digit
            columnNumber /= 26;
        }
        
        return sb.reverse().toString();
    }
}