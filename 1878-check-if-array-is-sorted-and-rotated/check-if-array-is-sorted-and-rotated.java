class Solution {
    public boolean check(int[] nums) {

        // 0 1 2 3 4 5  - > i < i+1 - > true -> non decresing order
        // acceped that there is only one codn where i > i+1 % n

        int count = 0;
        for(int i = 0 ; i< nums.length ;i++){

            System.out.println(nums[i]+" : "+nums[(i+1)%nums.length]);

            if(nums[i] > nums[(i+1)%nums.length]){
                count++;
            }
        }

        if(count <= 1 ){
            return true;
        }

        return false;
    }


}