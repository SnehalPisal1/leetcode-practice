class Solution {
    public int findLucky(int[] arr) {

        // map < element , count>
        // if element == count - > its lucky - > i will check it from end of map  -> asc
        // reverse map based on keys -> descending order

        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for(int n: arr){
                map.put(n, map.getOrDefault(n, 0) + 1);
        }

        System.out.println(map);


        
        for(int key : map.keySet()){
            if(map.get(key) == key){
                return key;
            }
        }

       return -1; 
    }
}