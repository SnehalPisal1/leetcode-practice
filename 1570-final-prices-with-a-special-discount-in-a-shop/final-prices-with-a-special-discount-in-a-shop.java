class Solution {
    public int[] finalPrices(int[] prices) {

            int discountPrice[] = new int[prices.length];
            int index = 0;


            for(int i = 0; i<prices.length;i++){
                System.out.println(prices[i]);
                 boolean discount = false;

                for(int j = i + 1; j<prices.length; j++){

                    if(prices[i] >= prices[j]){
                        discount = true;
                        discountPrice[index++] = prices[i] - prices[j];
                        break;
                    } else{
                      discount = false;
                    }
                }
                System.out.println("discount flag : "+discount);

                if(!discount){
                    discountPrice[index++] = prices[i];
                }
            }

            return discountPrice;
    }
}