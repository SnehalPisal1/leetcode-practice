class Solution {
    public boolean checkIfExist(int[] arr) {

        // iterate array -> 
        // Set - >   2 * element
        // if element is present in set  -> true else -> false

        Set<Integer> set = new HashSet<>();
        for(int n: arr){
       
            set.add(n *2);
        }

        System.out.println(set);

        for(int n : arr){
          
            System.out.println(n);
            if(n !=0 && set.contains(n)){
                return true;
            }
        }  

         // Special case: check if there are at least two zeros
        int zeroCount = 0;
        for (int n : arr) {
            if (n == 0) zeroCount++;
        }
        return zeroCount >= 2;
    }
      
    }
