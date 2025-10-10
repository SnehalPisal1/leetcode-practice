class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

            // concate Strings and check wherthe they are equal or not

            String w1 = "";
            String w2 = "";

            for(String str1 : word1){
                w1 +=str1;
            } 

              for(String str2 : word2){
                w2 +=str2;
            } 

            if(w1.equals(w2)){
                return true;
            }
            
        return false;
        
    }
}