class Solution {
    public int islandPerimeter(int[][] grid) {


        int row = grid.length;
        int col =  grid[0].length;
        int para = 0;
        for(int i = 0; i < row;i++)
        {
            for(int j =0 ;j < col;j++){

                    if(grid[i][j] == 1){

                        // top
                       if(i == 0 || grid[i-1][j] == 0){
                            para++;
                        }
                        // bottom

                        if(i == row -1 || grid[i + 1][j] ==0){
                            para++;

                        }

                        // left

                        if(j ==0 || grid[i][j-1] == 0){
                            para++;

                        }
                        // right
                        if(j == col-1 || grid[i][j+1] == 0){
                            para++;
                        }

                    }

            }
        }
        return para;
    }
}