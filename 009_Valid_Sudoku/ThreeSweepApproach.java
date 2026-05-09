class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>(); 

        // rows check 
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') {
                    continue; 
                } else if(set.contains(board[i][j])) {
                    return false; 
                } else {
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }

        // columns check
        for(int j = 0; j < 9; j++) {
            for(int i = 0; i < 9; i++) {
                if(board[i][j] == '.') {
                    continue; 
                } else if(set.contains(board[i][j])) {
                    return false; 
                } else {
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }

        // blocks check 
        for(int i = 0; i < 9; i=i+3) {
            for(int j = 0; j < 9; j=j+3) {

                for(int row = i; row < i+3; row++) {
                    for(int col = j; col < j+3; col++) {
                        if(board[row][col] == '.') {
                            continue; 
                        } else if(set.contains(board[row][col])) {
                            return false;
                        } else {
                            set.add(board[row][col]);
                        }
                    }
                }

                set.clear();
                    
            }
        }

        return true;
    }
}

/* Time Complexity: Constant O(1)
Logic is simple. We traverse each row once to check, each column once to check, and each block once to check. And since a Sudoku will always be 9 x 9, the time complexity remains constant even with nested loops, making this the optimal approach. There is another solution that allows us to check in one sweep, but because it is complex, uses 27 hash sets, and is not readable, this is usually the preferred approach.*/
