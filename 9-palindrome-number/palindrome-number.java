class Solution {
    public boolean isPalindrome(int x) {

        //reverse no 
        int rem = 0;
        int rev= 0;

        int oriX=x;
        while(x>0){

            rem =x%10;
            rev = rev * 10+ rem;
            x= x/10;

            System.out.println(x);

        }  

        return (oriX==rev ? true : false);
    }
}