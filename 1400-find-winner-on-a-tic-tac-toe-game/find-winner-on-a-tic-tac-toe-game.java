class Solution {
   public String tictactoe(int[][] moves) {
        int n = 3;
        int[] rows = new int[n];
        int[] cols = new int[n];
        int diag1 = 0; // top-left to bottom-right
        int diag2 = 0; // top-right to bottom-left
        
        int player = 1; // 1 for A, -1 for B
        
        for (int[] move : moves) {
            int row = move[0];
            int col = move[1];
            
            rows[row] += player;
            cols[col] += player;
            
            if (row == col) {
                diag1 += player;
            }
            
            if (row + col == n - 1) {
                diag2 += player;
            }
            
            // Check if current player wins
            if (Math.abs(rows[row]) == n || Math.abs(cols[col]) == n || 
                Math.abs(diag1) == n || Math.abs(diag2) == n) {
                return player == 1 ? "A" : "B";
            }
            
            player *= -1; // Switch player
        }
        
        // If no winner and all moves are made, it's a draw
        // Otherwise, game is still pending
        return moves.length == n * n ? "Draw" : "Pending";
    }
}