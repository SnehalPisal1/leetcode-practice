class Solution {
    public void duplicateZeros(int[] arr) {

        // if zero found -> shift all elements to right and add one zero next to zero

        List<Integer> list= new ArrayList<>();

        for(int n: arr){

            list.add(n);
            if(n==0){
                list.add(0);
            }
        } 
        
        for(int i=0; i < arr.length; i++){

            if(i<list.size())
            arr[i]= list.get(i);

        }
    }
}