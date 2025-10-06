class Solution {
    public int minOperations(String[] logs) {

        List<String> logList = new ArrayList<>();

        for(int i = 0 ; i < logs.length ;i++){

            if(logs[i].equals("../")){
              if(logList.size() != 0)
                logList.removeLast();
            } else if(logs[i].equals("./")){
                continue;
            } else{
                logList.add(logs[i]);
            }

            System.out.println(logList);
        }

       return logList.size();
    }
}