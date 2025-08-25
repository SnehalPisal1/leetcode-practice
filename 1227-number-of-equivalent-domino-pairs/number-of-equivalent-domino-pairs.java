class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];

        //iterate dominoes
        for (int[] domino : dominoes) {
            int min = Math.min(domino[0], domino[1]);
            int max = Math.max(domino[0], domino[1]);
            int key = min * 10 + max;
            count[key]++;
        }


        int totalPairs = 0;
        for (int c : count) {
            totalPairs += c * (c - 1) / 2;
        }
        return totalPairs;
    }
}