class Solution {
    public int[] sumZero(int n) {

        int result[] = new int[n];
        // even or odd ?

        // even - > 4 - > -2, -1 , 1 , 2 = -n/2 -> n/2

        // odd - > 5 - > -2, -1 , 0, 1 , 2 = -n/2 ->  n/2 add 0
            int start = -n/2;
            int end = n/2;
            int index =0;
        if(n%2 == 0){
            //even

            for(int i = start; i <= end ;i++){
                if(i != 0){
                     result[index]=i;
                    index++;
                }
            }
        
        } else {
            //odd
            for(int i = start; i <= end ;i++){
                result[index]=i;
                index++;
            }

        }
        return result;
        
    }
}