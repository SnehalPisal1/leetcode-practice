class Solution {
    public int maximumPopulation(int[][] logs) {
        // Array to track population for each year (1950 to 2050)
        int[] population = new int[101]; // 2050 - 1950 + 1 = 101 years
        

        //
        // For each person, mark their living years
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            
            // Person contributes to population from birth to death-1
            for (int year = birth; year < death; year++) {
                population[year - 1950]++;
            }
        }
        
        // Find the year with maximum population
        int maxPopulation = 0;
        int maxYear = 1950;
        
        for (int year = 1950; year <= 2050; year++) {
            int index = year - 1950;
            if (population[index] > maxPopulation) {
                maxPopulation = population[index];
                maxYear = year;
            }
        }
        
        return maxYear;
    }
}