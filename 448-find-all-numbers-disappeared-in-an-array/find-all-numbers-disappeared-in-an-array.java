class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {


        Set<Integer> set = new LinkedHashSet<>();

        for(int n: nums){
            set.add(n);
        }

        int index = 1;

        List<Integer> list = new ArrayList<>();
        while(index <= nums.length){

            if(!set.contains(index)){
                    list.add(index);
            }
        index++;

        }

        return list;
    }
}