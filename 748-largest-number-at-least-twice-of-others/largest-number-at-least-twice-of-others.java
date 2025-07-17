class Solution {
    public int dominantIndex(int[] nums) {

        int n = nums.length;

        Map<Integer, Integer> map =new HashMap<>();

        for(int i =0 ;i < n ;i++){
            map.put(nums[i], i);
        }

        // find large number


        Arrays.sort(nums);
        int largeNo = nums[n-1];

        // other numbers * 2 should be less than equals to large num 

        for(int i = 0;i < n - 1; i++){
        // if not -> return -1 else -> return large number

            if(nums[i] * 2 > largeNo){
                return -1;
            }
        }
        
     
        return map.get(largeNo);
        
    }
}