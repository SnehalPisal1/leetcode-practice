class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int result[] = new int[n + 1];

        // low pointer
        int low = 0;

        // high pointer
        int high = n;

        int index = 0;
        for(char ch : s.toCharArray()){
        // if ch ==  I - > low++;

            if(ch == 'I'){
                System.out.println("Low : "+low);
                result[index] = low++;
             }
        // if ch == D - > high--

             else {
                        result[index] = high--;
            }
             System.out.println("Low : "+low +"High : "+high);

            index++;
        }
        // remaining one 
        result[n] =low;
        return result;
    }
}