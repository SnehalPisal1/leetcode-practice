class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if (words.length == 0) return result;
        
        String firstWord = words[0];
        
        for (int i = 0; i < firstWord.length(); i++) {
            String currChar = String.valueOf(firstWord.charAt(i));
            boolean presentInAll = true;
            
            // Check all words except first
            for (int j = 1; j < words.length; j++) {
                if (!words[j].contains(currChar)) {
                    presentInAll = false;
                    break;
                }
            }
            
            if (presentInAll) {
                result.add(currChar);
                // Remove just one occurrence from each word
                for (int j = 1; j < words.length; j++) {
                    words[j] = words[j].replaceFirst(currChar, "");
                }
            }
        }
        
        return result;
    }
}