class Solution {
    public int strStr(String haystack, String needle) {

        if(!haystack.contains(needle) || needle.length() > haystack.length()){
            return -1;
        }

        if(haystack.equals(needle)){
            return 0;
        }

        for(int i=0; i< haystack.length() ;i++){

            String str=haystack.substring(i, i+needle.length());
            System.out.println("str : "+str);
            if(str.equals(needle)){
                 return i;

            } else {
                continue;
            }
        }

    return -1;
        
    }
}