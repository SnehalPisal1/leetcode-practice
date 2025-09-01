class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // need to find out Occurrance
        Map<Integer,Integer> map= new HashMap<>();

        for(int n: arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        Set<Integer>  set = new HashSet<>();
        
        for(int count : map.values()){

                if(!set.add(count)){
                    return false;
                }
        }
        return true;
    }
}