class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        
        // n - m // 8 // 8 -2  =  6
        int count = 0;
        for(int i =0 ; i < n - m ;i ++){

        System.out.println(arr[i] +" : "+ arr[i+m]);

            if(arr[i] == arr[i+m]){
                count++;
            }else {
                count= 0;
            }
            System.out.println("Count : "+count);
        if(count >= m*(k-1)){
            return true;
        }
        }
        return false;
    }
}