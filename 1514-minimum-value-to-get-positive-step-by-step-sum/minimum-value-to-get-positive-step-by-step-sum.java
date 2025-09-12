class Solution {
    public int minStartValue(int[] nums) {
        
        int startValue = 0;
        // startValue + minValue >= 1

        int minValue = 0;
        int current = 0;
        for(int i = 0; i < nums.length ; i++){

            current += nums[i]; // -1 -3 -4 
                System.out.println(current);
                minValue = Math.min(current, minValue); //-1 -4

        }
        System.out.println("final minValue:"+minValue);
        startValue = 1 - minValue;
        if(startValue <= 0){
            return 1;
        }
        return startValue;
    }
}
