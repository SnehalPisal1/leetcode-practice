class Solution {
    public int pivotIndex(int[] nums) {

        int total = 0;
        for(int n : nums){
            total += n;
        }

        System.out.println("total: "+total);
        int left = 0;
        for(int i = 0; i<nums.length;i++){
            int right = total - left - nums[i];
                    System.out.println("right : "+right);

                if(left == right){
                     return i;
                     }
                left += nums[i];
               System.out.println("left : "+left);

        }

        return -1;

    }
}