class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxW = 0;
        for(int i = 0 ; i < accounts.length ; i++){ // rows - > no of account

            int sum = 0;
            for(int j = 0; j < accounts[0].length ; j++){ // col - > cal wealth

                sum += accounts[i][j];

                maxW = Math.max(sum, maxW);

            }

        }
        return maxW;
    }
}