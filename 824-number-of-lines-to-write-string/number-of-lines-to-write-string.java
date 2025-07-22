class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        // String to char array
        int currWidth = 0;
        int line = 1;
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
        // cal index of char to find width 
            int index = ch - 'a';
            System.out.println("Index : "+index);
        //  add it in to currWidth
        // check currWidth <= 100 then add char to String

            if(currWidth + widths[index] > 100)
            {
                line++;
                currWidth =0;
                str.setLength(0);
            } 

                currWidth = currWidth + widths[index];
                str.append(ch);       
             }

           int result = 0;
           for(char ch : str.toString().toCharArray()){
        // cal index of char to find width 
            int index = ch - 'a';
            result += widths[index];
           }
        return new int[]{line, result};
    }
}