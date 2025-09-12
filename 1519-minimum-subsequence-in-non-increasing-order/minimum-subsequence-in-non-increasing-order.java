class Solution {
    public List<Integer> minSubsequence(int[] nums) {

        // sort array 

        // start from end , will pick element  > sum of all ther elements( total - pick element) , print
        //other wise we will add one more element from the array


        Arrays.sort(nums);

        int total =0;
        for(int n: nums){
            total += n;
        }
        int subseqSum =0;
        List<Integer> result = new ArrayList<>();
        int index = nums.length - 1;
        while(total >= subseqSum) {
            subseqSum += nums[index]; // 7 7 6 -> 20
            total -= nums[index]; // 28 -  7 -> 21 -> 14 -6 = 8
            result.add(nums[index]);
            index--;
        }  // 7 7 6
        
        return result;
    }
}