class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> list = new ArrayList<>();

       // nums
       // convert  k -> array
       int index = num.length - 1;
            int carry = 0;

       while(k > 0 || index >=0 || carry > 0){

            int digit = index>=0 ? num[index] : 0;
            System.out.println("digit -- "+ digit );

            int digitK = k % 10; // 4
            System.out.println("digitK -- "+ digitK );

            int sum = digit + carry + digitK;
            System.out.println("sum -- "+ sum );
            list.add(sum % 10);
            carry = sum / 10;

            k = k / 10; 
            index --;
       }

               System.out.println("List -- "+ list);
              Collections.reverse(list);
               System.out.println("List -- "+ list);
     return list;

    }
}
        