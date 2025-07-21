class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

      // will convert licensePlate in alaphbets and all in lower case. will take one map to store char -> count
      Map<Character, Integer> licensePlateMap = new HashMap<>();

        for(char ch :  licensePlate.toLowerCase().toCharArray()){

            if(Character.isLetter(ch)){
                licensePlateMap.put(ch, licensePlateMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("converted Map: "+ licensePlateMap);

        String result = null;

        for(String word : words){
                // one by one will check above converted licensePlate is pereent in words..
                        System.out.println("word "+ word);

                if(isCompletingWord(word, licensePlateMap)){
                    if(result == null || result.length() > word.length()){
                      result = word;
                    }
                }
        System.out.println("result "+ result);

        }

      return result;
       
    }
    

      // map to store char - > count of each word 

      public static boolean isCompletingWord(String word,  Map<Character, Integer> licensePlateMap){

        Map<Character, Integer> map = new HashMap<>();

        for(char ch :  word.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);  
        }

        for(char key :  licensePlateMap.keySet()){

            if(!map.containsKey(key) || map.get(key) < licensePlateMap.get(key)){
                return false;
            }
        }

        return true;
      }
}