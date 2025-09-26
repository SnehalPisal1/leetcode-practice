class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        // Mathmetical way -> count of all possible odd sequences.. by selecting possible start and end elements

        int totalSum = 0;
        int n = arr.length;
        for(int i = 0; i<n ;i++){

            // select start and end 

            int left = i+1; // 1 - > start - > index 0 (1)
            int right = n - i; // 5 - > index 0 1 2 3 4 

            int totalSubArrays = left * right; // 1 * 5 -> 5

            int oddSubArrays = (totalSubArrays  + 1 )/ 2 ; // 5 /2 - > 2

            totalSum += oddSubArrays * arr[i];


        }

        return totalSum;

   
    }
        
    }
