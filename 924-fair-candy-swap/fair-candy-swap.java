class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        // total A
        int totalA = 0;
        for(int n:aliceSizes ){
            totalA +=n;
        }
        // total Bob
         int totalB = 0;
        for(int n:bobSizes ){
            totalB +=n;
        }

      //  int a , int b
        for(int i = 0; i <aliceSizes.length ;i++){

            int a = aliceSizes[i];

            for(int j = 0; j < bobSizes.length ;j++){
                int b = bobSizes[j];

                       if((totalA - a + b) == (totalB - b + a)){
                        return new int[]{a,b};
                       }
            }
        }
        return new int[]{};
    }
}