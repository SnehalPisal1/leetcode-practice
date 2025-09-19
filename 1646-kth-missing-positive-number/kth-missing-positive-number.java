public class Solution {
    public int findKthPositive(int[] arr, int k) {
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

        int count = 0;
        int num = 1;
       int index = 0;

        while(count < k){

            if (index <  arr.length && arr[index] == num){
                index++;
            } else{
                count++;
                if(count == k){
                    return num;
                }
            }
            num++;
        }

        return num;
    }
}