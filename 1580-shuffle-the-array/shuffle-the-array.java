class Solution {
    public int[] shuffle(int[] nums, int n) {

        int result[] = new int[nums.length];

        int index = 0;

       // 2,5,1,3,4,7
        // 0,1,2,3,4,5
        

        for(int i = 0 ; i < n; i++){

            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
        
    }
}
