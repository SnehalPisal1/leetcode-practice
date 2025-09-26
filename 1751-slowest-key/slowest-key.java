class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {


        // iterate loop releaseTimes

        int largestRelTime = 0;
        int preCharRelTime = 0;
        char result = ' ';

        for(int i = 0; i < releaseTimes.length ; i++){

            int currentCharRelTime = releaseTimes[i] - preCharRelTime;
            System.out.println(currentCharRelTime);
            if(currentCharRelTime > largestRelTime){
                 largestRelTime = currentCharRelTime;
                 result = keysPressed.charAt(i);
                 System.out.println(result+" : "+largestRelTime);
             } else if(currentCharRelTime == largestRelTime){
                  result = result > keysPressed.charAt(i) ? result :  keysPressed.charAt(i);
                 System.out.println(result+" : "+largestRelTime);
             } else{
                 preCharRelTime = releaseTimes[i];
                continue;
             }

            preCharRelTime = releaseTimes[i];
        }

        return result;
        
    }
}