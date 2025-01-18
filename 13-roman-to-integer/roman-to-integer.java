class Solution {
    public int romanToInt(String s) {

       Map<Character, Integer> romanMap = new HashMap<>();
        
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);

        int result = 0;

        for(int i=0;i<s.length();i++){

            char ch= s.charAt(i);
            
            int current = romanMap.get(s.charAt(i));
            System.out.println("current : "+current);
            if(i+1 < s.length()){

            int next = romanMap.get(s.charAt(i+1));

                if(current >= next){

                    result += current;
            System.out.println("result : "+result);

                }else{
                    result -= current;
                }
    
                
            }else{
                                    result += current;

            }



                        
        }
        return result;
        
    }
}