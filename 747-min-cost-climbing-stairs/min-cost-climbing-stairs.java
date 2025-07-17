class Solution {
    public int minCostClimbingStairs(int[] cost) {

      /*  min (10, 15) - > 10
        10 + 20 -> 30 min(15, 30) -> 15 */

        int a = cost[0];
        int b = cost[1];         
        for(int i = 2; i<cost.length; i++){

          int current = cost[i] + Math.min(a, b); 

            a=b;
            b= current;
            
        }

        return  Math.min(a, b);
    }
}