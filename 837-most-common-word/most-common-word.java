class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        //split pragraph to string array
        // map String - > count 
        // will pick key which has high count

       String convertedPara = paragraph.toLowerCase().replaceAll("[,-.!?:';]"," ");

        String[] words = convertedPara.replaceAll("  "," ").split(" ");

        System.out.println("Paragraph: "+ convertedPara );
        Map<String, Integer> map =  new TreeMap<>();
        for(String word : words){

            map.put(word, map.getOrDefault(word, 0)+1);
            
        }
        System.out.println("map: "+ map);
    

    for(String bannedWord : banned){
            map.remove(bannedWord);
    }
        System.out.println("map after remove banned words: "+ map);

            // will pick key which has high count

    int maxValue = 0;
    String result = null;
    for(String key : map.keySet()){

        if(maxValue < map.get(key)){
            maxValue =  map.get(key);
            result = key;
        }
    }

    return result;

}
 
}