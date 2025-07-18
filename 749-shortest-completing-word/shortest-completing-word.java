class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] charArr=licensePlate.toLowerCase().toCharArray();

        for(char ch: charArr){

            if(Character.isLetter(ch)){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Map : "+map);

        String result = null;
        for(String word : words){

            
           if(isCompletingWord(word, map)){
            if( result == null || word.length() < result.length() ){
                                System.out.println("result : "+result);

                result = word;
            }
           }
        }
        return result;
    }
     
    public static boolean isCompletingWord(String word,  Map<Character, Integer> map){

        Map<Character, Integer> mapCompletingWord = new LinkedHashMap<>();
        char[] charArr = word.toCharArray();
                System.out.println("word : "+word);

        for(char ch: charArr){
                mapCompletingWord.put(ch, mapCompletingWord.getOrDefault(ch, 0) + 1);    
        }
                System.out.println("mapCompletingWord : "+mapCompletingWord);

        for(Character key : map.keySet()){

            if(!mapCompletingWord.containsKey(key) || map.get(key) > mapCompletingWord.get(key)){
                    return false;
            } 
    
        }
        

        return true;
    }

    }