class Solution {
    public int repeatedNTimes(int[] nums) {


        Set<Integer> set =  new HashSet<>();

        for(int n : nums){
            // find duplicate number -> if duplicate -> return false
            if(!set.add(n)){
                return n;
            }
        }
        return -1;
    }
}