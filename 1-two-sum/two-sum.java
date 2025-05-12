class Solution {

    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> map =new LinkedHashMap<>();
        // iterate int loop

        for(int i=0;i<nums.length;i++){

        // complement = target - nums[i];
        int complement = target - nums[i];

        // complement is present in hashmap or not
        if(map.containsKey(complement)){

            return new int[]{map.get(complement), i};

        } else{
            map.put(nums[i], i);
        }

        }

        return new int[]{};
       
    }
    }
