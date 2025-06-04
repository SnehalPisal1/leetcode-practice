class Solution {
    public int majorityElement(int[] nums) {


        int maxcount=0;
        int majarEle =0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
        map.put(n, map.getOrDefault(n, 0) + 1 );

        }

        for(int key: map.keySet()){
        if(map.get(key) > maxcount) {
            maxcount = map.get(key);
            majarEle = key;
        }
        }
        return majarEle;
    }
}