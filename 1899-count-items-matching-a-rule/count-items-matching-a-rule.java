class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count =0 ;
        for(List item : items){



                if (ruleKey.equals("type")){

                    if(ruleValue.equals(item.get(0))){
                    count++;
                   System.out.println("Type : "+ item.get(0) + " : "+ count);

                    }
                }
                
                if (ruleKey.equals("color")){

                 if(ruleValue.equals(item.get(1))){
                    count++;
                                       System.out.println("color : "+ item.get(1) + " : "+ count);

                    }
                }

                if (ruleKey.equals("name")){

                 if(ruleValue.equals(item.get(2))){
                    count++;
                                       System.out.println("name : "+ item.get(2) + " : "+ count);

                    }
                }
            
        }
        
        return count;
    }
}