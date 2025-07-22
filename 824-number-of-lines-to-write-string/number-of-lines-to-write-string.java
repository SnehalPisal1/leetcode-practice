class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        // String to char array
        int currWidth = 0;
        int line = 1;
        for(char ch : s.toCharArray()){
        // cal index of char to find width 
            int index = ch - 'a';
                    //  add it in to currWidth
        // check currWidth <= 100 then add char to String

            if(currWidth + widths[index] > 100)
            {
                line++;
                currWidth = widths[index];
            } else{
                currWidth = currWidth + widths[index];
            }
             }

        return new int[]{line, currWidth};
    }
}