class Solution {
    public int sumOfUnique(int[] nums) {

         // find out unique elements from the nums array
            Map<Integer, Integer> map =  new HashMap<>();
            for(int n : nums){
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            System.out.println(map);
            int sum = 0;
            for(int key : map.keySet()){
                if( map.get(key) == 1){
                    sum += key;
                }
            }

            return sum;
    }
}