class Solution {
    public double findMaxAverage(int[] nums, int k) {

    double maxAvg = 0 ;
    double windowAvg = 0;
    double sum =0 ;
    for(int i=0 ; i<k;i++){
        sum += nums[i];
    }
    windowAvg = sum/k;

    maxAvg =  windowAvg;

    for(int i = k; i < nums.length ; i++){
        sum = sum + nums[i] - nums[i-k];
        windowAvg = sum/k;
       maxAvg = Math.max(maxAvg,windowAvg);
    }

        return maxAvg;
        
    }
}