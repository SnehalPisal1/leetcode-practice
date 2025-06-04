class Solution {
    public int maxProfit(int[] prices) {

        int maxpro= 0;
        int minprice = prices[0];


        for(int i =0; i < prices.length ; i++){

            if(minprice > prices[i]){
                minprice=prices[i];
            } else{
                int currprof = prices[i] - minprice;
                maxpro=Math.max(maxpro, currprof);
            }

        }
     
     
     /*
        for(int i=prices.length-1; i>0; i--){
            for(int j = 0 ; j < i ; j++){

                int profit= prices[i] - prices[j];

                if(maxpro < profit){
                    maxpro = profit;
                }
            }
        }
     */

        return maxpro;
        
    }
}