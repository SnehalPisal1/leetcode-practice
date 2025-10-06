class Solution {
    public int[] frequencySort(int[] nums) {
        int result[] = new int[nums.length];

        // calculte fequecny of each element
        Map<Integer,Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        System.out.println(map);

        // sort map based on values ie. frequency...

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.<Integer, Integer>comparingByValue().thenComparing(Map.Entry.<Integer, Integer>comparingByKey().reversed()));
            int index = 0 ;

        System.out.println(list);

        for(Map.Entry<Integer, Integer> m : list){
            System.out.println(m);

        int frequency = m.getValue();
            while(frequency > 0){
                result[index] = m.getKey();
                frequency--;
                index++;
            }
        }
        
        return result;
    }
}