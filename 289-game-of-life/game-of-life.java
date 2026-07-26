class Solution {

    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        // 8 Directions
        int[][] dir = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},           {0,1},
            {1,-1},  {1,0},   {1,1}
        };

        // First Pass: Mark changes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int live = 0;

                // Count live neighbours
                for (int[] d : dir) {

                    int nr = i + d[0];
                    int nc = j + d[1];

                    if (nr >= 0 && nr < m &&
                        nc >= 0 && nc < n &&
                        Math.abs(board[nr][nc]) == 1) {

                        live++;
                    }
                }

                // Live cell dies
                if (board[i][j] == 1 && (live < 2 || live > 3)) {
                    board[i][j] = -1;
                }

                // Dead cell becomes live
                if (board[i][j] == 0 && live == 3) {
                    board[i][j] = 2;
                }
            }
        }

        // Second Pass: Convert markers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }
}