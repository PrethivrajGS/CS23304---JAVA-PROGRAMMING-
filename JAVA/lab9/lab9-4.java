class InvalidBoardSizeException extends Exception {
    public InvalidBoardSizeException(String message) {
        super(message);
    }
}

class EightQueens {
    private static final int SIZE = 8; 
    private int[] board;

    public EightQueens() {
        board = new int[SIZE];
    }
    public void solve() throws InvalidBoardSizeException {
        if (SIZE < 1) {
            throw new InvalidBoardSizeException("Board size must be a positive integer.");
        }
        placeQueens(0);
    }
    private boolean placeQueens(int row) {
        if (row == SIZE) {
            printBoard();
            return true;
        }

        for (int col = 0; col < SIZE; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                if (placeQueens(row + 1)) {
                    
                    return true;
                }
                
                board[row] = -1;
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
           
            if (board[i] == col || 
                board[i] - i == col - row || 
                board[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

   
    private void printBoard() {
        System.out.println("One of the possible solutions:");
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row] == col) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            EightQueens queens = new EightQueens();
            queens.solve();
        } catch (InvalidBoardSizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
