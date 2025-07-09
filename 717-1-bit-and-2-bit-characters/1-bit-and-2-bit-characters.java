class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        int len= bits.length;
        int i = 0;
        while(i < len - 1){
            if(bits[i] == 0){
                i +=1;
            }else{
                i +=2;
            }
            
        }

        return i == len-1;
        
    }
}