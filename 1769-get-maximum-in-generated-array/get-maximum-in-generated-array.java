class Solution {
    public int getMaximumGenerated(int n) {

        if (n == 0)
        return 0;

        if( n == 1){
            return 1;
        } 


        int num[]= new int[n+1];

        num[0] = 0;
        num[1] = 1;

        int max = 1;
        for(int i = 2 ; i<=n ;i++){

            //even indices
            if(i % 2 == 0){

                num[i] = num[  i / 2];

            }
            //odd indices 
            else{
                num[i] = num[i/2] + num[i/2 + 1];
            }

            max=Math.max(max, num[i]);
            System.out.println(max);
        }

        return max;
    }
}