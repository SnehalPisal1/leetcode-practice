class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int temp[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);

        Map<Integer, Integer> map= new HashMap<>();

        for(int i = 0; i < temp.length ; i++){
            map.put(temp[i], map.containsKey(temp[i]) ? map.get(temp[i]) : i);
        }

        int result[] = new int[nums.length];
        int index =0 ;
        for(int n : nums){
            result[index] = map.get(n);
            index++;
        }

        return result;
    }
}