class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int result[] = new int[nums1.length]; 
        int index =0 ;

        Map<Integer, Integer> map= new HashMap<>();

        for(int i =0 ;i < nums2.length ;i++){
            int next = -1;
            for(int j = i+1 ; j < nums2.length ;j++){

                    if(nums2[j] > nums2[i]){
                        next = nums2[j];
                        break;
                    }
            }
                    map.put(nums2[i], next);

        }

        System.out.println(map);

        for(int n: nums1){

            if(map.containsKey(Integer.valueOf(n))){
                result[index++] = map.get(n);
            }

        }
        return result;
    }
}