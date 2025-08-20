class Solution {
    public boolean canThreePartsEqualSum(int[] nums) {


        // first need to check sum of all numbers in the array is divide by 3 or not
        int sum = 0;
        for(int n : nums){
            sum +=n;
        }
    
        System.out.println("sum : " +sum);

        // if not  - >  false

        if(sum % 3 != 0){
            return false;
        }

        // else need to calculate target - > sum / 3 -> 3 that means each partition has target amount (sum)

        int target = sum / 3;
        System.out.println("target : " +target);

        int sumPart =0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
             sumPart += nums[i];
              System.out.println("sumPart : "+sumPart);

             if(sumPart == target){
                count++;
                sumPart = 0;
             }
                     System.out.println("Count : "+count);

         if(count == 2 && i < nums.length - 1){
            return true;
        }

        }

    

        return false;
    }
}