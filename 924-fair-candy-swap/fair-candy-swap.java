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

        // totalA - a + b == totalB - b + a
           // b + b + totalA - totalB - a -a=0
          //  b = a - (totalA - totalB) / 2 

          Set<Integer> setBob = new HashSet<>();

          for(int n : bobSizes ){
            setBob.add(n);
          }

          for(int a : aliceSizes){

           int  b = a - (totalA - totalB) / 2 ;
            if(setBob.contains(b)){
                return new int[]{a,b};
            }

          }

    /*  //  int a , int b
        for(int i = 0; i <aliceSizes.length ;i++){

            int a = aliceSizes[i];

            for(int j = 0; j < bobSizes.length ;j++){
                int b = bobSizes[j];

                       if((totalA - a + b) == (totalB - b + a)){
                        return new int[]{a,b};
                       }
            }
        } */

        return new int[]{};
    }
}