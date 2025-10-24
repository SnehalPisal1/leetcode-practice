class Solution {
    public double trimMean(int[] arr) {

        Arrays.sort(arr);

        int  removeCount = arr.length * 5 / 100;

        double sum = 0;

        for(int i = removeCount ; i < arr.length - removeCount ; i++){
            sum += arr[i];
        }

        return sum / (arr.length - 2 * removeCount);


    }
}