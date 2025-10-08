class Solution {
    public int getMaximumGenerated(int n) {

        if( n < 2){
            return n;
        }

        int[] nums = new int[n+1];

        int max = 1;

        nums[0] = 0;
        nums[1] = 1;

        for(int i = 2; i < nums.length ;i++){

                // even indeices
                if( i % 2 == 0){
                    nums[i] = nums[ i/ 2];
                }
                // odd indices
                else
                {
                    nums[i] = nums[i/2 + 1] + nums[i/2];
                }

            max= Math.max(max, nums[i]);

        }

        return max;
    }
    }

    