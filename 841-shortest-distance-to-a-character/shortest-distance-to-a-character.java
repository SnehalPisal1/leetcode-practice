class Solution {
    public int[] shortestToChar(String s, char c) {


        System.out.println(s.length());

        // String to char Array 
        int[] arr= new int[s.length()];

        List<Integer> result = new ArrayList<>();

        char[] chArr = s.toCharArray();

        for(int i = 0; i<chArr.length; i++){
            System.out.println(i);
            // if element found
            if(chArr[i] == c){
              //add to list - > 0
                result.add(0);
                System.out.println(result);
            }
            else{
                int minDist = Integer.MAX_VALUE;
           //itrate loop till we found give char , 
            for(int j = 0; j<chArr.length; j++){ 
                if(chArr[j] == c){ 
                //check char == given char c
                int dist=Math.abs(j-i);
                if(minDist > dist)
                minDist = dist;
                }   
             } 
              result.add(minDist); // add it into list
                System.out.println(result);
            }
        }

        System.out.println(result);

        for(int i = 0; i<arr.length; i++){
            arr[i] = result.get(i);
        }
         return arr;
    }
}