class Solution {
    public int heightChecker(int[] heights) {

        Map<Integer, Integer> map= new LinkedHashMap<>();
        int count = 0;
        for(int i=0; i<heights.length;i++){
            map.put(i,heights[i]);
        }
        Arrays.sort(heights);

        for(int i=0; i<heights.length;i++){

          if(map.get(i) != heights[i]){
            count++;
          }
        }
        return count;
        
    }
}