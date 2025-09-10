import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] sortByBits(int[] arr) {
        // Create a list of numbers
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        // Sort with custom comparator
        Collections.sort(list, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if (countA == countB) {
                return a - b;
            }
            return countA - countB;
        });
        
        // Convert back to array
        int[] result = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}