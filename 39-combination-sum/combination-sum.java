import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to help with pruning
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
            // Since array is sorted, we can break early if candidate is too large
            if (candidates[i] > remaining) {
                break;
            }
            
            // Add the candidate to current combination
            current.add(candidates[i]);
            
            // Recursively explore with the same candidate (since we can reuse)
            backtrack(candidates, remaining - candidates[i], i, current, result);
            
            // Backtrack - remove the last added candidate
            current.remove(current.size() - 1);
        }
    }
}