class Solution {
    public int minOperations(String[] logs) {
        // List -> String 
        List<String> list = new ArrayList<String>();
        for(String log: logs){
            if(log.equals("../")){
                if(list.size() < 1){
                   continue;
                } else{
                    list.removeLast();
                }
            } else if(log.equals("./")){
                continue;
            } else {
                list.add(log);
            }

        }
        // return size of list 
        return list.size();
        
    }
}