class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {

        // iterate pieces an dstore it into map  -> first element of piece[0] - > piece array
        // iterate arr -> will check elements present in map or not 
        // if not present then return false
        // else will check next elements

        Map<Integer,int[]>  map = new LinkedHashMap<>();
        for(int[] piece : pieces){
            map.put(piece[0], piece);
        }
        System.out.println(map);

        int i = 0 ;
        while(i < arr.length){

                System.out.println("arr Ele : "+ arr[i]);

                if(!map.containsKey(arr[i])){
                    return false;
                } 

                int[] piece = map.get(arr[i]);

                for(int n : piece ){
                      System.out.println("arr n-> : "+ n);
                }

                        
                for(int j = 0; j <piece.length ;j++){                    
                    if(arr[i+j] != piece[j]){
                        return false;
                    }
                }
                    i +=piece.length;

                }
        return true; 
    }
}