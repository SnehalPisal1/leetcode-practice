class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1){
            return s;
        }

        String str ="";
        StringBuilder[] row = new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            row[i]= new StringBuilder();
        }

        int currentRow =0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {

            row[currentRow].append(c);


            if(currentRow==0 || currentRow == numRows-1){
                          goingDown = !goingDown;  
            }


            currentRow += goingDown?1:-1;
   
         }

              // Build the final result by concatenating all rows.
        StringBuilder result = new StringBuilder();
        for (StringBuilder r : row) {
            result.append(r);
        }

        return result.toString();

        }
        
       


    }
