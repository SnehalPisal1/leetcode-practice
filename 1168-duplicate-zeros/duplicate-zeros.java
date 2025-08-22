class Solution {
    public void duplicateZeros(int[] arr) {

        // list - > if zero found add one more zero
        // put list values in arr

        List<Integer> list = new ArrayList<>();

        for(int n : arr){
            list.add(n);
            if(n == 0){
                list.add(n);
            }
        }

        for(int i=0 ;i < arr.length;i++){
            arr[i] = list.get(i);
        }
    }
}