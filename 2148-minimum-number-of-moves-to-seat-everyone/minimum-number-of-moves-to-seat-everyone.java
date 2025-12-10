class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {

        // sort array

        Arrays.sort(seats);
        Arrays.sort(students);

        int totalMoves = 0;

        if(seats.length != students.length){
            return 0;
        }

        for(int i = 0; i<seats.length; i++){

            int moves = Math.abs(students[i] - seats[i]);

            totalMoves +=moves;

        }

        return totalMoves;
        
    }
}