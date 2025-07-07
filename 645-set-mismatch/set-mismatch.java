class Solution {
    public int[] findErrorNums(int[] nums) {

        int len = nums.length;
        int duplicateNo = 0;
        // find duplicate
        Set<Integer> set =  new HashSet<>();
        for(int n: nums){
            if(!set.add(n)){
                duplicateNo = n;
            }
        }
        // find missing number

        int total =  len * (len + 1)/2;
        for(int n: set){
            total -= n;
        }

       return new int[]{duplicateNo, total};
        
    }
}