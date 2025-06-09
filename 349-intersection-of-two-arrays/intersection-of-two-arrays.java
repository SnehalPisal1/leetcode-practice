class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        

            Set<Integer> set = new LinkedHashSet<>();
            for(int n : nums1){
                set.add(n);
            }


            Set<Integer> intersec = new LinkedHashSet<>();
            for(int n : nums2){

                if(set.contains(n)){
                    intersec.add(n);             
                }

            } 

            int result[]= new int[intersec.size()];

            int index =0;
           for(int n: intersec){

            result[index++] = n;

           }



        return result;
    }
}

    