class Solution {
    public boolean isValidSudoku(char[][] board) {
        return helper(board);
    }
    private boolean helper(char[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> squareSet = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                // for row
                char rowChar = board[i][j];
                if (rowChar != '.' && !rowSet.add(rowChar))
                    result = false;

                // for col
                char colChar = board[j][i];
                if (colChar != '.' && !colSet.add(colChar))
                    result = false;

                // for square
                char squareChar = board[(i/3)*3 + (j/3)][(i%3)*3 + (j%3)];
                if (squareChar != '.' && !squareSet.add(squareChar))
                    result = false;

            }
        }
        return result;
    }
}
