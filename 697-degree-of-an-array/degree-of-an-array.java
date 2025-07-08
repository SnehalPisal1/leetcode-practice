class Solution {
    public int findShortestSubArray(int[] nums) {

        // degree should be max

        int maxDegree =0;
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> firstAcc = new HashMap<>();
        Map<Integer,Integer> lastAcc = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(!firstAcc.containsKey(nums[i])){
                firstAcc.put(nums[i], i);
            }    
                lastAcc.put(nums[i], i);

        }

        for(int key: map.keySet()){

                if(map.get(key)> maxDegree){
                    maxDegree = map.get(key);
                }

        }

        System.out.println(maxDegree);
        System.out.println(firstAcc);
        System.out.println(lastAcc);

        List<Integer> maxFre = new ArrayList<>();
        for(int key : map.keySet())
        {
                if(map.get(key) == maxDegree){
                    maxFre.add(key);
                }
        }
        System.out.println(maxFre);

        // size of subArray is min
        int minLen = Integer.MAX_VALUE;

        for(int n: maxFre){

            int len = lastAcc.get(n) - firstAcc.get(n) + 1;
            if(len < minLen){
                minLen = len;
            }
        }

        return minLen;


    }
}