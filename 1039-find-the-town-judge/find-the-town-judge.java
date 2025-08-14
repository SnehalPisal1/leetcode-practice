import java.util.*;

class Solution {
    public int findJudge(int n, int[][] trust) {
        Set<Integer> trusters = new HashSet<>();
        Map<Integer, Integer> trustCount = new HashMap<>();

        for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];
            trusters.add(a);
            trustCount.put(b, trustCount.getOrDefault(b, 0) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (!trusters.contains(i) && trustCount.getOrDefault(i, 0) == n - 1) {
                return i;
            }
        }

        return -1;
    }
}