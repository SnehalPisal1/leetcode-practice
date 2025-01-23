class Solution {
    public boolean isValid(String s) {

        if(s.length() % 2 != 0){
            return false;
        }

        char[] openingBracktes = {'(','{','['};

        HashMap<Character, Character> hm=new  HashMap<>();

        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');


        Stack<Character> stack=new Stack<>();

        for(char ch : s.toCharArray()){

            if(new String(openingBracktes).chars()
                                  .anyMatch(value -> value == ch)){
                stack.push(ch);
            } else {
                if(!stack.isEmpty()){
                    char top = stack.peek();
                    if(top == hm.get(ch)){
                        stack.pop(); 
                        }else{
                            return false;
                        }

                } else {
                    return false;
                }
            }


        }

        if(!stack.isEmpty())
        {
            return false;
        }

        return true;


        
    }
}