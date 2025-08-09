class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] priority = new int[26];
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            priority[c - 'a'] = i; 
        }

        
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            
            int minLen = Math.min(word1.length(), word2.length());
            boolean isSamePrefix = true;
            
            for (int j = 0; j < minLen; j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                
                if (c1 != c2) {
                    if (priority[c1 - 'a'] > priority[c2 - 'a']) {
                        return false; // Words are out of order
                    }
                    isSamePrefix = false;
                    break;
                }
            }
            
            // If all compared characters are the same, check word lengths
            if (isSamePrefix && word1.length() > word2.length()) {
                return false;
            }
        }
        
        return true;
    }
}