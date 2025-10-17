class Solution {
    public String truncateSentence(String s, int k) {

        // split string

        String[] splittedString =  s.split(" ");

        if(k >= splittedString.length){
            return  s;
        }

        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ;i<k;i++){
            
            if(i>0){
               sb.append(" "); 
            }

            sb.append(splittedString[i]);

        }
        
        return sb.toString();        
    }
}