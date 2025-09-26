class Solution {
    public int specialArray(int[] nums) {

       /* x = 0 ;  only 0 >= 0
        x= 1; only one element in nums >=1
        x= 2; only 2 elements in nums >=2 */

        for(int x = 0; x <=nums.length ;x++){

            int count = 0;
            for(int n: nums){

                System.out.println(x +" : "+n);
                if(x <= n){
                    count++;
                }
            }
                System.out.println("Count : "+count);

            if(x == count){
                return x;
            }


        }

      return -1;
        
    }
}