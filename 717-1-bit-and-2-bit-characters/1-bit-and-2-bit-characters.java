class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        int n = bits.length;
            int index = 0 ;
            while(index < n - 1){
                if(bits[index] == 0){
                    index +=1;
                }else {
                    index +=2;
                }
            }

            return index == n-1;
    }
}