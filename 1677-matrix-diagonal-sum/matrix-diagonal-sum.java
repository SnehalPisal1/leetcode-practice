class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;

        int n =  mat.length;

            // top-left - > bottom-right  indices - > 00 11 22 33 ...

            for(int i = 0; i < n ;i++){

                sum  += mat[i][i] ;
            }

            System.out.println(sum);
            //top-right -> bottom-left indices - > 02, 11, 20... - > 0 1 2 -> row i 

            
           for(int i = 0; i < n ;i++){

        sum += mat[i][n - 1 - i];
           }
           System.out.println(sum);

           // remove double counted center if mat has odd dimention

           if(n % 2 == 1){
            sum -=mat[n/2][n/2];
           } 

        return sum;
    }
}