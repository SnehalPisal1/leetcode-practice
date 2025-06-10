class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        for(int n : nums1 ){
            list.add(n);
        }

        List<Integer> inSec = new ArrayList<>();

        for(int n : nums2){

            if(list.contains(n)){
                
                inSec.add(n);
                list.remove(Integer.valueOf(n));
            }
        }

        int result[] =  new int[inSec.size()];
        int index = 0;

        for(int n : inSec){
            result[index++] = n;
        }

        return result;

        
    }
}