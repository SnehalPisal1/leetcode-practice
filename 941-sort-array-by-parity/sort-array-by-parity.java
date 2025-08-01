class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
     Map<Integer, Boolean> map = new LinkedHashMap<>();
        for(int n : nums){
            map.put(n,  n % 2 == 0?true:false);
        }

        int[] result = new int[nums.length];
        int i = 0;

      /*  for(int key :  map.keySet()){
            if(map.get(key) == true){
                result[i] = key;
                i++;
            }
        }

        // remaining
            for(int key :  map.keySet()){
            if(map.get(key) == false){
                result[i] = key;
                i++;
            }
        }
       return result; */

       for(int n: nums){
             if(map.get(n) == true){
                result[i] = n;
                i++;
            }
       } 

       
        // remaining
        for(int n: nums){


            if(map.get(n) == false){
                result[i] = n;
                i++;
            }
        
    }
     return result; 
    }
}