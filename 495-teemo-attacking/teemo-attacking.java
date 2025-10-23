class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        
        int total = 0;
        
        for (int i = 0; i < timeSeries.length - 1; i++) {
            // Calculate the gap between current and next attack
            int gap = timeSeries[i + 1] - timeSeries[i];
            
            // If the gap is less than duration, we only add the gap
            // Otherwise, we add the full duration
            total += Math.min(gap, duration);
            
            System.out.println("After attack at " + timeSeries[i] + ": total = " + total);
        }
        
        // Add the full duration for the last attack
        total += duration;
        
        System.out.println("After last attack at " + timeSeries[timeSeries.length - 1] + ": total = " + total);
        
        return total;
    }
}