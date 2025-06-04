class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map= new LinkedHashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int key : map.keySet()){

            if(map.get(key) > 1){
                return true;
            }
        }

        return false;
        
    }
}