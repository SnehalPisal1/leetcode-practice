class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Map<Integer, Integer> map= new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();

        Set<Integer> set = getSet(nums1);
        for(int n : set){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        System.out.println(map);
        Set<Integer> set1 = getSet(nums2);

        for(int n : set1){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        System.out.println(map);

        Set<Integer> set2 = getSet(nums3);

        for(int n : set2){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        System.out.println(map);


        for(int n : map.keySet()){
            if(map.get(n)>=2){
                System.out.println(n);

                list.add(n);

            }
        }

        return list;
    }

    public Set<Integer> getSet(int[] num){
 Set<Integer> set1 = new LinkedHashSet<>();

        for(int n :  num){
            set1.add(n);
        }
        return set1;
    }
}