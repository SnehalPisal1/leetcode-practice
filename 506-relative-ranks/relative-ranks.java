class Solution {
    public String[] findRelativeRanks(int[] score) {


        List<Integer> list =  new ArrayList<>();

        for(Integer n : score){
            list.add(n);
        }

        Collections.sort(list,Comparator.reverseOrder());

        Integer[] sortedArr = list.toArray(new Integer[0]);
        List<String> result = new ArrayList<>();

        Map<Integer, String> map= new LinkedHashMap<>();

        for(int i = 0 ; i< sortedArr.length ; i++){

                if(i == 0){
                    map.put(sortedArr[i], "Gold Medal");
                }
                else if(i == 1){
                 map.put(sortedArr[i], "Silver Medal");
                }
                else if(i == 2){
                 map.put(sortedArr[i], "Bronze Medal");
                }
                else {
                map.put(sortedArr[i], Integer.toString(i+1));
                }
        }
        
        for(int i = 0 ; i< score.length ; i++){
            result.add(map.get(score[i]));
        }
    
       return  result.toArray(new String[0]);
    }

}