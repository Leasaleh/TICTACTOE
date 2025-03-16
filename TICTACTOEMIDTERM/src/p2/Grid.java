package p2;

//The game board
class Grid {
    private Square[][] squares;
    private static final int SIZE = 3;

    public Grid() {
        squares = new Square[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                squares[i][j] = new Square();
            }
        }
    }

    public void display() {
        System.out.println("  1 2 3");
        for (char row = 'A'; row <= 'C'; row++) {
            System.out.print(row + " ");
            for (int col = 1; col <= 3; col++) {
                System.out.print(squares[row - 'A'][col - 1].getValue());
                if (col < 3) System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean makeMove(char row, int col, char symbol) {
        int rowIndex = row - 'A';
        int colIndex = col - 1;
        if (squares[rowIndex][colIndex].getValue() == ' ') {
            squares[rowIndex][colIndex].setValue(symbol);
            return true;
        }
        return false;
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (squares[i][0].getValue() == symbol && squares[i][1].getValue() == symbol && squares[i][2].getValue() == symbol)
                return true;
            if (squares[0][i].getValue() == symbol && squares[1][i].getValue() == symbol && squares[2][i].getValue() == symbol)
                return true;
        }
        if (squares[0][0].getValue() == symbol && squares[1][1].getValue() == symbol && squares[2][2].getValue() == symbol)
            return true;
        if (squares[0][2].getValue() == symbol && squares[1][1].getValue() == symbol && squares[2][0].getValue() == symbol)
            return true;
        return false;
    }

    public boolean isFull() {
        for (Square[] row : squares) {
            for (Square square : row) {
                if (square.getValue() == ' ') return false;
            }
        }
        return true;
    }
}
