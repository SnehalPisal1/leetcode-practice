class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count =0 ;
        for(List item : items){
            switch(ruleKey){
                
                case "type" : 
                    if(ruleValue.equals(item.get(0))){
                    count++;
                    }
                break;
                
                  case "color" : 
                 if(ruleValue.equals(item.get(1))){
                    count++;
                    }
                    break;

                case "name" : 
                 if(ruleValue.equals(item.get(2))){
                    count++;
                    }
                break;
            }
        }
        
        return count;
    }
}