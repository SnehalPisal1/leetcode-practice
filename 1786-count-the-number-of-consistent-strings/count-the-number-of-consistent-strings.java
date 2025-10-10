class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        for(String word : words){

            // i will convert this word to charArray and will check each char is present in allowed string or not

            boolean presentFlag = true;
            for(char ch : word.toCharArray()){

                   if(allowed.indexOf(ch) < 0){
                        presentFlag = false;
                    }

            }

            if(presentFlag){
                count++;
            }

        }

        return count;
        
    }
}