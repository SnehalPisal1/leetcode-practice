class Solution {
    public int largestAltitude(int[] gain) {

        int maxAltitude = 0;
        int start = 0;

        for(int g : gain){
            start += g;
         maxAltitude = Math.max(start, maxAltitude);

        }
        return maxAltitude;
    }
    
}