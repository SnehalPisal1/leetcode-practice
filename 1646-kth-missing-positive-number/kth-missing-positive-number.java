public class Solution {
    public int findKthPositive(int[] arr, int k) {


        // original arr - > 1 2  3 4 5  6 7  8 - > index start from 0 , 0th - > 1 value index+1

        int num = 1;
        int MissingNumIndex = 0;

        int index = 0;
        while(MissingNumIndex < k){
            // if num is preset in array else

            if(index < arr.length && arr[index] == num){
                index++;
            } else{
                 MissingNumIndex++;

                if(MissingNumIndex == k){
                    return num;
                }
            }
            num++;
          System.out.println("Num.........."+num);
        }
        return num ;

      /*  int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - (mid + 1) < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left + k;*/

    }
    
    }