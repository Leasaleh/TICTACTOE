package p2;

import java.util.Scanner;

//Game controller
class Game {
    private Grid grid;
    private Player player1, player2;

    public Game() {
        grid = new Grid();
        choosePlayers();
    }

    private void choosePlayers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name for Player 1: ");
        String name1 = scanner.nextLine();

        System.out.print("Do you want to play against another human? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        player1 = new Human('X', name1);

        if (choice.equals("yes")) {
            System.out.print("Enter name for Player 2: ");
            String name2 = scanner.nextLine();
            player2 = new Human('O', name2);
        } else {
            player2 = new Computer('O');
        }
    }

    public void play() {
        Player currentPlayer = player1;
        while (true) {
            grid.display();
            currentPlayer.makeMove(grid);
            if (grid.checkWin(currentPlayer.getSymbol())) {
                grid.display();
                System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ") wins!");
                break;
            }
            if (grid.isFull()) {
                grid.display();
                System.out.println("It's a draw!");
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}