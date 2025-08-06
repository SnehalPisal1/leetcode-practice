class Solution {
    public int minDeletionSize(String[] strs) {

          int len = strs[0].length();

          int deleteCount = 0;

          for(int col = 0; col < len; col++){
            
            for(int row = 1; row < strs.length ;row++){

                    if(strs[row].charAt(col) < strs[row - 1].charAt(col)){
                        deleteCount++;
                        break;
                    }

            }


          }

          return deleteCount;
    }
}