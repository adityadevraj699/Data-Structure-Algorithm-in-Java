class Solution {
    public boolean isValidSudoku(char[][] board) {

        int n=board.length;

        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];

        for (int i = 0; i < n; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               
                if(board[i][j] != '.'){
                    char cell = board[i][j];
                    int boxindex = 3*(j/3)+i/3;
                   if(row[i].contains(cell) || col[j].contains(cell) || box[boxindex].contains(cell)){
                    return false;
                   }

                   row[i].add(cell);
                   col[j].add(cell);
                   box[boxindex].add(cell);

                }
            }
        }

        return true;
        
    }


}