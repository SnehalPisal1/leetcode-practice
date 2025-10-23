class Solution {
    public double trimMean(int[] arr) {


        Arrays.sort(arr);
        int n = arr.length;

        int removeCount =(int) (n * 0.05);
        System.out.println(removeCount);

        double sum = 0;
        for(int i = removeCount; i < n - removeCount; i++){
            sum += arr[i];
        }

        return sum / (n - 2 * removeCount ) ; 
        
    }
}