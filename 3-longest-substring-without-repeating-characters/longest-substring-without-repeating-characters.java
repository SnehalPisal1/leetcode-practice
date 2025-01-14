class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len=0;
        for(int i=0;i<s.length();i++){

            for(int j=i+1;j<=s.length();j++){

                        String str=s.substring(i,j);

                        if (isUnique(str)) {
                        len = Math.max(len, str.length());
                          }  else{
                                break;
                            }  
     }
     }
       
        
        return len;
        
    }

     private boolean isUnique(String str) {
        boolean[] charSet = new boolean[128]; // Assuming ASCII characters
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (charSet[index]) {
                return false; // Duplicate character found
            }
            charSet[index] = true;
        }
        return true; // All characters are unique
    }
}


