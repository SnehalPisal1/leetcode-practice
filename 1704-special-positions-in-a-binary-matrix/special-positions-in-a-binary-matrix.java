class Solution {
    public int numSpecial(int[][] mat) {

        int count = 0;

        int rows = mat.length; // 3

        int cols = mat[0].length; // 3

        int rowSum[] = new int[rows];
        int colSum[] = new int[cols];

        for(int i =0 ; i <rows ;i++){
            for(int j = 0; j <cols; j++){
                if(mat[i][j] == 1){
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }

        for(int i =0 ; i <rows ;i++){
            System.out.print(rowSum[i]+" ");
        }

            System.out.println("cols sum");

        for(int i =0 ; i <cols ;i++){
            System.out.print(colSum[i]+" ");
        }

         for(int i =0 ; i <rows ;i++){
            for(int j = 0; j <cols; j++){

                if(mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1 ){
                    count++;
                }
            }
        }

        return count;


    } 
}