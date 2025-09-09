class Solution {
    public int[] arrayRankTransform(int[] arr) {

    
        int result[] = new int[arr.length];

        //set assending order

        Set<Integer> set = new TreeSet<>();
         for(int n: arr){

            set.add(n);
        }


        // map - > element , rank

        Map<Integer, Integer> map = new HashMap<>();
        int index = 1;
        for(int n : set ){
            map.put(n, index);
            index++;
        }

        for(int i=0; i< arr.length;i++){

            if(map.containsKey(arr[i])){
                result[i] = map.get(arr[i]);
            }
        }

        return result;
    }
}