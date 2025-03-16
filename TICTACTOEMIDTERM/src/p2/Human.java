package p2;

import java.util.Scanner;

//Human player
class Human extends Player {
    private Scanner scanner;

    public Human(char symbol, String name) {
        super(symbol, name);
        scanner = new Scanner(System.in);
    }

    @Override
    public void makeMove(Grid grid) {
        boolean validMove = false;
        while (!validMove) {
            System.out.print(name + " (" + symbol + "), enter your move (e.g., A1, B2): ");
            String move = scanner.next().toUpperCase();
            if (move.length() == 2 && move.charAt(0) >= 'A' && move.charAt(0) <= 'C' && move.charAt(1) >= '1' && move.charAt(1) <= '3') {
                char row = move.charAt(0);
                int col = move.charAt(1) - '0';
                validMove = grid.makeMove(row, col, symbol);
            }
            if (!validMove) {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
}
