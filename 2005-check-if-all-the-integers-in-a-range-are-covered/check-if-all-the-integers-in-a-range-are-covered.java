class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {


        for(int num = left ; num <= right ; num++){
        
        boolean isCovered =  false;

                  for(int[] n : ranges){
                        int start = n[0];
                        int end = n[1];
                         if(num >= start && num <= end){
                            isCovered = true;
                            break;
                         }
             }

             if(!isCovered){
                return false;
             }


        }

        return true;       
    }
}