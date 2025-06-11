class Solution {
    public int thirdMax(int[] nums) {

        // decending order and return 3 element

        // if array contain less than 3  elements then max number


        Set<Integer> set = new TreeSet<>(); // ascending order

        for(int n : nums){
            set.add(n);
        }


        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Comparator.reverseOrder());

        if(list.size() < 3){
            return list.get(0);
        }
        return list.get(2);      
    }
}