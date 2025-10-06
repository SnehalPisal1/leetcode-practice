class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        // Mathmetical way -> count of all possible odd sequences.. by selecting possible start and end elements

        int n =  arr.length;

        int totaloddArr= 0;

        for(int i = 0; i<n;i++){


            int left = i + 1; // 0 iu.e value 1
            int right = n - i; // 5 index 0 1 2 3 4

            int totalSubArrays = left * right ;

            int oddSubArrays = (totalSubArrays + 1 ) / 2; //- > 3
            System.out.println(oddSubArrays);

            totaloddArr += oddSubArrays * arr[i];
        }

        return totaloddArr;
        
    }
    }
