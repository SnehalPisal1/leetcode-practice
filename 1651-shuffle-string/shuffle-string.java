class Solution {
    public String restoreString(String s, int[] indices) {

        // map<index, char> 
        // iterate map and generate new String from values of the map

        Map<Integer, Character> map = new TreeMap<>();

        int index = 0;
        for(char ch : s.toCharArray()){
            map.put(indices[index++] , ch);
        }

        String newString = "";

        for(char ch : map.values()){

            newString +=ch;
        }
        return newString;
    }
}