class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // add extraCanties to each elemnt and check where it is greatest among them
        // if yes  -> add it into the list;

        List<Boolean>  result= new ArrayList<>();

        for(int i = 0;i< candies.length ;i++){

                int sumCandies = candies[i] + extraCandies;
                System.out.println("sumCandies:"+sumCandies);
                boolean greatestFlag = true;
                for(int j = 0;j< candies.length ;j++){

                    if(i!=j  && sumCandies < candies[j]){
                        greatestFlag = false;   
                    }
                }

                result.add(i, greatestFlag);
        }

        return result;
    }
}