class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0 ;
        int ten = 0;

        for(int bill : bills){

            if(bill == 5){
                five++;
            }
            else if(bill == 10){
                if(five > 0){
                five--;
                 ten++;

                } else{
                    return false;
                }
            } else { // 20
                 // 1 -> 10 and 1 -> 5 Or 3 -> 5

                 if(ten>0 && five>0){
                    five--;
                    ten--;
                 } else if(five >=3) {
                    five -=3;
                 } else {
                    return false;
                 }

            }

        }
            return true;


         /*   int totalCollectedBill=0;
          for(int bill : bills){
                System.out.println("bill: " + bill);

            if(bill == 5){
                totalCollectedBill +=bill;
            } else {

                int returnBill =  bill - 5;
                System.out.println("returnBill: " + returnBill);
                
                if(totalCollectedBill - returnBill >=0){
                     totalCollectedBill = totalCollectedBill + 5 - returnBill;
                } else {
                    return false;
                }
            }
            System.out.println("totalCollectedBill: " + totalCollectedBill);
          }
        return true;
        */

        

    } 

}