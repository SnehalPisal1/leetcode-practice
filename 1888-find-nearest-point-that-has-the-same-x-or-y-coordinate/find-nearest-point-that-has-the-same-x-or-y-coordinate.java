class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int smallestDist = Integer.MAX_VALUE;
        int smallestIndex = -1;
        int index=0;
        for(int[] point : points){

            // valid point
            if(point[0] == x || point[1] == y){

                int manDist = Math.abs(x - point[0]) + Math.abs(y - point[1]);

                System.out.println("manDist : "+ manDist);
                if(manDist < smallestDist){

                    smallestDist = manDist;
                    System.out.println("smallestDist : "+ smallestDist);
                    System.out.println("index : "+ index);
                    smallestIndex = index;
                }

            }
                index++;

        }

      return smallestIndex;
    }
}