package p2;

import java.util.Random;

//Computer player
class Computer extends Player {
    private Random random;

    public Computer(char symbol) {
        super(symbol, "Computer");
        random = new Random();
    }

    @Override
    public void makeMove(Grid grid) {
        int col;
        char row;
        do {
            row = (char) ('A' + random.nextInt(3)); // Random row ('A', 'B', or 'C')
            col = random.nextInt(3) + 1; // Random column (1, 2, or 3)
        } while (!grid.makeMove(row, col, symbol));
        System.out.println("Computer chose: " + row + col);
    }
}

