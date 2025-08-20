class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        List<Boolean> list = new ArrayList<>();
      int current =0 ;
       for (int i = 0 ; i < nums.length ; i++) {
        current =(current * 2 + nums[i]) % 5;
        if(current == 0){
            list.add(true);
        }
        else{
            list.add(false);
        }
    }
        return list;
    }
}
