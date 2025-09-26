class Solution {
    public int[] frequencySort(int[] nums) {

        // map<num, frequency>
        // sort map based on values 
        // put keys -> result array

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int n : nums){
            map.put(n , map.getOrDefault(n, 0)+1);
        }

        System.out.println(map);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
         System.out.println(list);

list.sort(Map.Entry.<Integer, Integer>comparingByValue()
    .thenComparing(Map.Entry.<Integer, Integer>comparingByKey().reversed()));
             System.out.println(list);

        int index = 0 ;
        int result[] = new int[nums.length];
        for(Map.Entry<Integer,Integer> entry : list){
            int frequency = entry.getValue();
            while( frequency > 0){
            result[index] = entry.getKey();
                    frequency--;
                    index++;
            }
        }

        return result;
    }
}