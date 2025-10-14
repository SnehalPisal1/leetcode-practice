class Solution {
    public int countGoodRectangles(int[][] rectangles) {
 
            Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
            for(int[] rectangle : rectangles){

            int length = rectangle[0];
            int width = rectangle[1];

            int squreLen = Math.min(length, width);
            System.out.println("squreLen : "+squreLen);

            map.put(squreLen, map.getOrDefault(squreLen ,0) + 1);
           
        }
                //return map.firstEntry().getValue();    - > TreeMap

                return map.entrySet().iterator().next().getValue();
 }
}