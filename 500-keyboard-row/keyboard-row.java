class Solution {
    public String[] findWords(String[] words) {

        String firstRow = "qwertyuiop";
        String secRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for(String word : words){

            String lowerWord = word.toLowerCase();

            boolean first = true;
            boolean sec = true;
            boolean third= true;
            for(char c: lowerWord.toCharArray()){

                if(firstRow.indexOf(c)== -1){
                    first = false;
                }
                if(secRow.indexOf(c)== -1){
                    sec = false;
                }
                if(thirdRow.indexOf(c)== -1){
                    third = false;
                }

            }

            if(third || first || sec){
                    list.add(word);
            }

        }

        String str[] = new String[list.size()];
        int index =0;
        for(String s: list ){
            str[index++]= s;
        }

        return str;
    }
}