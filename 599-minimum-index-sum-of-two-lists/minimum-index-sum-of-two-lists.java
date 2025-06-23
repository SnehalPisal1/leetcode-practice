class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> result =  new ArrayList<>();

      List<String> l1 =  new ArrayList<>(List.of(list1));
      List<String> l2 =  new ArrayList<>(List.of(list2));

        Map<String , Integer> map= new TreeMap<>();

        for(String rest : list1){

            if(l2.contains(rest)){
            int index = l2.indexOf(rest)  + l1.indexOf(rest);
                map.put(rest, index); // 1, 1, 4
            }
        }

        System.out.println(map);


        List<Map.Entry<String , Integer>> list = new  ArrayList<Map.Entry<String , Integer>>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        Map<String , Integer> resultMap= new LinkedHashMap<>();

        int minIndex = Integer.MAX_VALUE;

        System.out.println(list);


        for(Map.Entry<String , Integer> ls:list){

            if(ls.getValue() <= minIndex){
                minIndex = ls.getValue(); 
            result.add(ls.getKey());
            }

        }

        return result.toArray(new String[0]);
    }
}