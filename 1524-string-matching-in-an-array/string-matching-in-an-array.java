class Solution {
    public List<String> stringMatching(String[] words) {

        // sort array
       // Arrays.sort(words);
      

        Set<String> set = new HashSet<>();

        // iterate loop 
        for(int i = words.length - 1 ;i >=0 ;i--){

            for(int j =  words.length -1 ; j>=0; j--){

                if(!words[i].equals(words[j]) && words[i].contains(words[j])){
                    set.add(words[j]);
                }
            }
        }
        // List
        List<String> list = new ArrayList<>(set);
        return list;
    }
}