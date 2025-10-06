class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {

        //c -> 0 ->9
        // b -> 9 ->29 =  20

       // -> itearte tuimes i will calulate dution for each key .. take one varible longest and another for resp key

        int longestDuration = 0;
        char key = 0;
        int preReleaseTime = 0;
        for(int i = 0; i< releaseTimes.length;i++){

            int duration = releaseTimes[i]-preReleaseTime;
            System.out.println(duration);
            if(duration > longestDuration){
                longestDuration = duration;
                key = keysPressed.charAt(i);
            } 
            if(duration == longestDuration){
                if(key < keysPressed.charAt(i)){
                    key = keysPressed.charAt(i);
                }
            }
            preReleaseTime = releaseTimes[i];
        }
 return key;
}}