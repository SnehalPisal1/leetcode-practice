class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
 
       // find numbers with min abs diff- > first one
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length - 1 ;i++) {
            int diff = Math.abs(arr[i]-arr[i+1]);
            minDiff = Math.min(minDiff, diff);
        }
        System.out.println("min Diff : "+minDiff);
        // will find pairs of min diff 
        for(int i = 0 ; i < arr.length - 1 ;i++) {
        int diff = Math.abs(arr[i]-arr[i+1]);
        System.out.println(" Diff : "+diff);
        List<Integer> list = new ArrayList<>();

            if(diff == minDiff){
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
       }

       // put it into list 
       return result;
        
    }
}