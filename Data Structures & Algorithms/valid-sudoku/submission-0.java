class Solution {
    public boolean isValidSudoku(char[][] board) {
        return row(board) && column(board) && square(board);
    }
    private boolean row(char[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            Set<Character> hashSet = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c == '.')
                    continue;
                if (!hashSet.add(c))
                    result = false;
                // hashSet.add(board[i][j]);
            }
        }
        return result;
    }

    private boolean column(char[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            Set<Character> hashSet = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                char c = board[j][i];
                if (c == '.')
                    continue;
                if (!hashSet.add(c))
                    result = false;
            }
        }
        return result;
    }

    private boolean square(char[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            Set<Character> hashSet = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                char c = board[(i / 3) * 3 + (j / 3)][(i % 3) * 3 + (j % 3)];
                if (c == '.')
                    continue;
                if (!hashSet.add(c))
                    result = false;
            }
        }
        return result;
    }
}
