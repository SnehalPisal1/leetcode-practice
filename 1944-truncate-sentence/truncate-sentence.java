class Solution {
    public String truncateSentence(String s, int k) {

        // split string

        String[] splittedString =  s.split(" ");

        String result = "";

        for(int i=0 ;i<splittedString.length;i++){

            if(i<k){
            result += splittedString[i]+" ";
            } else {
                return result.trim();
            }

        }
        
        return result.trim();        
    }
}