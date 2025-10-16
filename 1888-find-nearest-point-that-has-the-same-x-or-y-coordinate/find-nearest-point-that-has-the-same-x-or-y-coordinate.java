class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int smallestDist = Integer.MAX_VALUE;

        int smallestIndex = -1;

        int index = 0;
        for(int[] point : points){

            if(point[0] == x || point[1] == y){

                int manhattanDist = Math.abs(x - point[0]) +  Math.abs(y - point[1]);

                System.out.println("manh : "+manhattanDist);

                if(smallestDist > manhattanDist){
                smallestDist =  manhattanDist;
                smallestIndex = index;
                
                System.out.println("Smallest : "+smallestIndex);

                }
            }
            index++;
        }

        return smallestIndex;
        
    }
}