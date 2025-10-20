class Solution {
    public int arraySign(int[] nums) {

        int prod = 1;
        for(int n : nums){
            
            if(n >  0){
                prod *= 1;
            } else if( n < 0){
               prod *= -1;
            } else {
                prod = 0;
            }
        } 

        return  signFunc(prod);
    }

    public int signFunc(int n){
           if(n >  0){
                n = 1;
            } else if( n < 0){
               n = -1;
            } else {
                n = 0;
            }

            return n;
    }
}