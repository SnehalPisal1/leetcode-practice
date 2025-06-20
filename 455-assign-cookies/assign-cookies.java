class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int maxContent = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int cookies = 0;
        int child = 0;

        while (child < g.length && cookies < s.length){

            if(g[child] <= s[cookies]){
               maxContent++; 
                cookies++;
            child++;
            } else {
            cookies++;
            }
        }
       
        
       
return maxContent;

        
    }
    }