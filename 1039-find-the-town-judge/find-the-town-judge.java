import java.util.*;

class Solution {
    public int findJudge(int n, int[][] trust) {
       
       // trust - > i -> truster
       // trust - > j -> may be judge

       Set<Integer>  truster = new HashSet<>();
       Map<Integer, Integer> count = new HashMap<>();

       for(int[] relation : trust){
        int a = relation[0];
        int b = relation[1];
        truster.add(a);
        count.put(b,count.getOrDefault(b,0)+1);
       }

       for(int i=1; i<=n ;i++){
        if(!truster.contains(i) && count.getOrDefault(i, 0) == n-1){
            return i;
        }
       }

       return -1;
}
}