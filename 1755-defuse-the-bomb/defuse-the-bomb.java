class Solution {
    public int[] decrypt(int[] code, int k) {

        int n= code.length;

        int[] result = new int[n];
        if(k == 0){
            return result;
        }

        for(int i = 0 ; i < n ;i++){

            if(k > 0){

                for(int j = 1 ; j <= k ;j++){

                    result[i] += code[(j + i) % n];
                }

            } else{

                System.out.println("negative : ");

             for(int j = -1 ; j >= k ; j--){

                System.out.println("Index : "+(i + j + n) % n);

                result[i] += code[ (i + j + n) % n]; // 3 2
                System.out.println(result[i]);

             }



            }
        }

        return result;
    }
}
