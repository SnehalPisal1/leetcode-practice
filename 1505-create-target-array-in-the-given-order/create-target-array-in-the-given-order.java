class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {


        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ;i++){
            list.add(index[i], nums[i]);
        }

        System.out.println(list);

        int[] result = new int[list.size()];
        int i = 0;
        for(int n : list){
            result[i] = list.get(i);
            i++;
        }
        return result;
    }
}