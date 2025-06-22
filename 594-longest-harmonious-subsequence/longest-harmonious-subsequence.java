class Solution {
    public int findLHS(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1); // 1 - 1, 3- 2, 2- 3 etc.

        }

        System.out.println(map);

        int maxLen = 0;
        for(int n : map.keySet()){

            if(map.containsKey(n+1)){


                maxLen=Math.max(map.get(n) + map.get(n+1), maxLen);
            }

        }


        return maxLen;
        
    }
}