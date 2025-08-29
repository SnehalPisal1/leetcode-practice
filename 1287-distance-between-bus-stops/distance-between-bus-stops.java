class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

       

        if(start > destination){
            //swap
            int temp = start;
            start = destination;
            destination = temp;
        }
        // clockwise
        int clockwise = 0;
        for(int i =start ; i<destination;i++){
            clockwise += distance[i];
        }
        // counter clockwise
        int totalDist =0;
        for(int i = 0 ;i<distance.length;i++){
            totalDist +=distance[i];
        }
        int counterClockwise = totalDist - clockwise;

        return Math.min(clockwise,counterClockwise);
    }
}