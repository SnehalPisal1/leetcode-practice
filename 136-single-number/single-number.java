class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map= new LinkedHashMap<>();

        int result=0;
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int key: map.keySet()){
                if(map.get(key) == 1){
                    result = key;
                    break;
                } 
        }

        return result;
        
    
}}