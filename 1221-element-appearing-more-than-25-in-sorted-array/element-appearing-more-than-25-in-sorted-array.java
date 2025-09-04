class Solution {
    public int findSpecialInteger(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        int value = 0;
        int resultKey = 0;
        for(int key : map.keySet()){
            if(value < map.get(key)){
                value =  map.get(key);
                resultKey = key;
            }
        }
        return resultKey;
    }
}