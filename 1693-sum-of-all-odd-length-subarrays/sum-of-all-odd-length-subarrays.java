class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int totalSum = 0;

        int n = arr.length;

        for(int  i =0 ; i<n ;i++){

                int left = i + 1; // 1
                int right = n - i; // 5

                int totalsubArrs = left * right ;// 5

                int oddsubArrs = (totalsubArrs + 1) / 2; // 3

                totalSum +=oddsubArrs * arr[i];


        }



        return totalSum;
    }
        
    }
