class Solution {
    public boolean validMountainArray(int[] arr) {

        //  consecutive numbers are same - >   false   ;

            // if length less than 3 - > false
        if(arr.length < 3){
         return false;
        }
            // strictly increasing
           int index = 0;

            while(index < arr.length - 1 && arr[index] < arr[index+1]){
                index++;
            }
            
            if(index == 0 || index == arr.length-1){
                         return false;
            }
            // strictly decreasing
      
         while(index < arr.length - 1 && arr[index] > arr[index+1]){
                            index++;
            }


        return index == arr.length -1;
    }
}