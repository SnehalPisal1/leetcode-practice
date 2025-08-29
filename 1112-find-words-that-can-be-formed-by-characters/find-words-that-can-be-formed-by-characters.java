class Solution {
    public int countCharacters(String[] words, String chars) {

       //frequency for each word comapre with freq of given string chars

       Map<Character, Integer> charsMap = new HashMap<>();

       int result =0;

       for(char ch : chars.toCharArray()){
        charsMap.put(ch, charsMap.getOrDefault(ch,0)+ 1);
       }

       for(String word : words){
            Map<Character, Integer> wordMap = new HashMap<>();

            boolean present = true;
            for(char ch : word.toCharArray()){
                wordMap.put(ch, wordMap.getOrDefault(ch,0)+ 1);
            }
            System.out.println("charsMap -"+charsMap);

            for(char ch : word.toCharArray()){

                if(!charsMap.containsKey(ch) || charsMap.get(ch) < wordMap.get(ch)){
                    present = false;
                }
            }
            System.out.println("wordMap -"+wordMap);

            System.out.println(word+"-"+present);

            if(present){
                 result += word.length();
             }
        
       }
        return result;
    }
}