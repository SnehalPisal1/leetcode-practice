import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] candidates, int remaining, int start, 
                          List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates to avoid duplicate combinations
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            // Since array is sorted, we can break early if candidate is too large
            if (candidates[i] > remaining) {
                break;
            }
            
            // Add the candidate to current combination
            current.add(candidates[i]);
            
            // Recursively explore with next index (i + 1) since we can't reuse same element
            backtrack(candidates, remaining - candidates[i], i + 1, current, result);
            
            // Backtrack - remove the last added candidate
            current.remove(current.size() - 1);
        }
    }
}