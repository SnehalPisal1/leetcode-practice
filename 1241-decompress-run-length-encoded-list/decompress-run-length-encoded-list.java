class Solution {
    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();

        // pair
        //first -> frequecy
        //second -> val add it in to array;

        for(int i = 0; i<nums.length - 1; i+=2){
            int frequency = nums[i];
            int value = nums[i+1];

            while(frequency > 0){
                list.add(value);
                frequency--;
            }

        }
        int result[] = new int[list.size()];

        int index = 0;
        for(int n: list){
            result[index] = n;
            index++;
        }

        return result;

    }
}