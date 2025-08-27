class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int totalDistance = 0;
        for (int d : distance) {
            totalDistance += d;
        }
        
        int clockwiseDistance = 0;
        int from = Math.min(start, destination);
        int to = Math.max(start, destination);
        for (int i = from; i < to; i++) {
            clockwiseDistance += distance[i];
        }
        
        int counterClockwiseDistance = totalDistance - clockwiseDistance;
        return Math.min(clockwiseDistance, counterClockwiseDistance);
    }
}