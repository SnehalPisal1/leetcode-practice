class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {


        // non wrap - around -> start <= end - need to add all elemnts between start to end

        // wrap around -> start > end -> need to add elemnts from 1 to end as well as start to n 

        int start = rounds[0];
        int end =  rounds[rounds.length - 1];

        List<Integer> result = new ArrayList<>();

        if(start <= end){
            for(int i = start ; i<=end ; i++){
                result.add(i);
            }
        } else {
            // i - > end
            for(int i = 1 ; i<=end ; i++){
                result.add(i);
            }
            // start -> n
              for(int i = start ; i<=n ; i++){
                result.add(i);
            }
        }



        System.out.println(result);


        return result;

        
    }
}