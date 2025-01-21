class Solution {
    public int reverse(int x) {

        int rem=0;
         int rev=0;


         boolean isNegative = false ;

         if(x<0){
            isNegative= true;
            x=Math.abs(x);
         }

        while(x>0){

            rem=x%10; 

            
         if (rev< -214748364 || rev>214748364 ) {
            return 0;
         }
            rev=rev*10+rem;
            x=x/10;



        }

        if(isNegative){
            rev= -rev;
        }
        
        return rev;
    }
}