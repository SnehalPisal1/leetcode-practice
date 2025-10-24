class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        int total = 0;

        for(int i =0;i < timeSeries.length - 1; i++){


            int gap = timeSeries[i+1] - timeSeries [i];
            System.out.println("gap : "+gap);

            total += Math.min(gap, duration);

            System.out.println("total : "+total);

        }


     
        return total + duration;
    }
}