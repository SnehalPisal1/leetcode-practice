class Solution {
    public int findShortestSubArray(int[] nums) {

            // degree of array
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
            Map<Integer,Integer> firstAcc= new HashMap<>();
            Map<Integer,Integer> lastAcc= new HashMap<>();
            List<Integer> maxFre = new ArrayList<>();
            for(int i= 0; i < nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                lastAcc.put(nums[i], i );
                if(! firstAcc.containsKey(nums[i])){
                    firstAcc.put(nums[i], i );

                }
            }

            int degree = Collections.max(map.values());
            // find out maxfreq elements
            for(int key : map.keySet()){
                if(map.get(key) == degree){
                    maxFre.add(key);
                }
            }
            // subarry
            int minLen = Integer.MAX_VALUE;
          
            for(int n : maxFre){

                int len=lastAcc.get(n) - firstAcc.get(n)+1;
                
                if(len < minLen){
                    minLen = len;
                }

            }

        return minLen;
    }
}