class Solution {
    public int findContentChildren(int[] g, int[] s) {

     Arrays.sort(g);
     Arrays.sort(s);

     int childCount = 0;
     int cookiesCount = 0;
     int ContentChildrenCount = 0 ;

     while(childCount < g.length && cookiesCount < s.length) {

        if(g[childCount] <= s[cookiesCount]){
        childCount++;
        cookiesCount++;
        ContentChildrenCount++;
        } else{
                    cookiesCount++;
        }
            
     }
        return ContentChildrenCount;
    }
}