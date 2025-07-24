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
                arr[i] =0;
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
                arr[i] = minDist;
            }
        }

        
         return arr;
    }
}