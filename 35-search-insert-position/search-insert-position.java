class Solution {
    public int searchInsert(int[] nums, int target) {

        if(nums.length == 0){
            return 0;
        }

        int low = 0;
        int high = nums.length-1;



        int index = 0;

        while( low <= high ){

             int mid = low + (high - low)/2;

             System.out.println("mid value : "+nums[mid]);

             if(nums[mid] == target){
                return mid;
             } 
             
            else if (nums[mid] > target){
                high = mid - 1;

  
             } else {
                low = mid+1;

             }
        }

      return low;
        
        
    }
}