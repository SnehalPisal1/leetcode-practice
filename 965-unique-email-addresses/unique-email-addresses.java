class Solution {
    public int numUniqueEmails(String[] emails) {

        // string split @ local + domainname
        // + stop processing  and . replace with "" -> processed local
        // append  processed local + @ domainname
        // add it into set and count

        Set<String> set = new HashSet<>();
        for(String email : emails){
            String splittedStr[] = email.split("@");
            System.out.println("splittedStr[0] -> "+splittedStr[0]);

            String processedLocal = "";
    
            for(char ch :   splittedStr[0].toCharArray()){
                if(ch == '+'){
                    break;
                }  else if(ch =='.') {
                    continue;
                }
                else{
                  processedLocal +=ch;  
                } 
            }
            System.out.println("local -> "+processedLocal);

            set.add(processedLocal+"@"+splittedStr[1]);

        }

        System.out.println("Set : "+set);

        return set.size();
    }
}