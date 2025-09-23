class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        
        // If the pattern length * repetitions exceeds array length, it's impossible
        if (m * k > n) {
            return false;
        }
        
        // Check each possible starting position for the pattern
        for (int i = 0; i <= n - m * k; i++) {
            boolean found = true;
            
            // Check if the pattern starting at i repeats k times
            for (int j = 0; j < m; j++) {
                // Compare each position in the pattern across k repetitions
                for (int rep = 1; rep < k; rep++) {
                    if (arr[i + j] != arr[i + j + rep * m]) {
                        found = false;
                        break;
                    }
                }
                if (!found) break;
            }
            
            if (found) {
                return true;
            }
        }
        
        return false;
    }
}