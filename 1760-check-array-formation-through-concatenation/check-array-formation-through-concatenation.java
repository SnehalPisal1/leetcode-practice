class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {

        // iterate pieces and put it into the map
        // first Ele of pieces - > piece []

        // iterate arr and check elememts one by one

        Map<Integer, int[]> map = new HashMap<>();

        for(int piece[] : pieces){
            map.put(piece[0], piece);
        }

            System.out.println(map);
        int  i = 0 ;
        while(i < arr.length){

            System.out.println("arr ele : "+arr[i]);

            if(!map.containsKey(arr[i])){
                return false;
            }
            
            int[] piece = map.get(arr[i]);

             for(int p = 0; p < piece.length ;p++){
                System.out.println("p : "+piece[p]);
             }

            if (piece.length > 1){
            for(int j = 1; j < piece.length ;j++){

                if(arr[i+j] != piece[j]){
                    return false;
                }
            }
            }

            i +=piece.length;

             System.out.println("i : "+i);


        }

        return true;

    }
 }

     