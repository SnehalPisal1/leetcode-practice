class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

            Map<Integer, Integer> map= new TreeMap<>();

            int result[] = new int[arr1.length];

            for(int n: arr1){
                map.put(n, map.getOrDefault(n,0)+1);
            }
            int index = 0;
            for(int n : arr2){
                    if(map.containsKey(n)){
                        int value = map.get(n);
                        while(value > 0){
                            result[index] = n;
                            value--;
                            index++;
                        }
                        map.remove(n);
                    }
            }

            System.out.println("Not presnt in Arr2:"+map);
            // now add numbers these are not presnt in arr2
            
            for(int n : map.keySet()){
               int value = map.get(n);
                        while(value > 0){
                            result[index] = n;
                            value--;
                            index++;
                        }
            }
            return result;
    }
}