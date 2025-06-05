class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {


        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;

/*
        int count = 0 ;
        int singleCount = 0;

        for(int i=0;i< nums.length;i++){
            for(int j= i+1;j < nums.length;j++){

                if(nums[i] == nums[j] && Math.abs(i - j ) <= k)
                {
                  return true;
                }
            }
        }

return false;
        
*/

    }
}