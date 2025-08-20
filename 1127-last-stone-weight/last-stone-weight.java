class Solution {
    public int lastStoneWeight(int[] stones) {

        Arrays.sort(stones);  
        int i = stones.length-1 ;
        while(i>0){
            Arrays.sort(stones);  

            System.out.println(stones[i]+" - "+ stones[i-1]);
           
                stones[i-1] =  stones[i] - stones[i-1];
                 System.out.println("---"+stones[i-1]);

                i--;
            
        }
      return stones[0];
    }
}