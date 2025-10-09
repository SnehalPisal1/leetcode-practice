class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;

        int[] result =  new int[n];

        if(k == 0){
            return result;
        }

        for(int i = 0 ; i<n ;i++){

            int sum = 0;

            if(k > 0){
                for(int j = 1; j <= k ;j++){
                    sum += code[(i + j) % n];
                    System.out.println("sum : "+sum);
                }

            } else{
                  System.out.println("inside negative : ");

                for(int j = -1; j >=k; j--){
                    int index = (i+j+n) % n;
                      System.out.println("index : "+index);

                    sum += code[index];
                    System.out.println("sum : "+sum);
                }
            }

            result[i] = sum;
        }

        return result;
    }}
     