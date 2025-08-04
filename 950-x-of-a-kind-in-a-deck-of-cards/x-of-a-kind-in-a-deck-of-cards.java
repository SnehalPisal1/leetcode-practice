class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        if(deck.length == 1){
            return false;
        }

        //map - > card, count

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int card : deck){

            map.put(card, map.getOrDefault(card, 0) + 1);            

        }
            System.out.println(map);


        int gcd = 0 ;
         for(int count : map.values()){
            System.out.println(gcd +" - "+count);
            gcd = findGcd(gcd , count);

            if(gcd == 1){
                return false;
            }
         }

         return true;

    }

    public static int findGcd(int firstNo,int secNo){
        int smallerNo = Math.min(firstNo, secNo);
        int largerNo = Math.max(firstNo, secNo);

        while(smallerNo != 0){
                        int temp = largerNo % smallerNo; 

            System.out.println(largerNo +" - "+smallerNo +" - "+temp);


            largerNo = smallerNo;

            smallerNo = temp;

        }

            return largerNo;
    }
}