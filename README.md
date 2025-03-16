# Tic-Tac-Toe Game

## Description
This is a simple Tic-Tac-Toe game implemented in Java. The game can be played between two human players or against a computer AI. The computer selects moves randomly.

## Features
- Play against another human or a computer.
- Simple console-based interface.
- Board displayed using a grid format.
- Input validation for correct moves.
- Win and draw detection.

## How to Play
1. Run the program.
2. Enter a name for Player 1.
3. Choose whether to play against another human or the computer.
4. If playing against a human, enter Player 2's name.
5. Players take turns entering their moves in the format `A1`, `B2`, etc.
6. The game ends when a player wins or the board is full.


## Classes Overview
1. Main (Main Class)
The entry point of the application. It creates a Game object and starts the game.
2. Game (Game Controller)
Manages the flow of the game between two players.
Calls the makeMove method of the current player.
Checks if a player has won or if the game is a draw.
Handles switching between players.
Methods:
choosePlayers(): Prompts the user to input player names and chooses the game mode (Human vs Human or Human vs Computer).
play(): Runs the main game loop, alternating turns between players.
3. Grid (Game Board)
Represents the Tic-Tac-Toe board and manages the game state.
Contains a 3x3 grid of Square objects where players make their moves.
Methods:
display(): Prints the current state of the game board.
makeMove(char row, int col, char symbol): Allows a player to make a move on the board.
checkWin(char symbol): Checks if a player has won the game.
isFull(): Checks if the board is full, indicating a draw.
4. Square (Represents a Square on the Board)
Represents each square on the Tic-Tac-Toe grid.
Methods:
getValue(): Returns the value stored in the square ('X', 'O', or ' ').
setValue(char value): Sets the value of the square ('X' or 'O').
5. Player (Abstract Player Class)
Represents a player in the game. Both the Human and Computer classes extend this class.
Methods:
getSymbol(): Returns the symbol of the player ('X' or 'O').
getName(): Returns the name of the player.
makeMove(Grid grid): Abstract method, overridden in the Human and Computer classes to define how each player makes a move.
6. Human (Human Player)
Represents a human player who inputs their moves manually.
Methods:
makeMove(Grid grid): Prompts the human player to input a move (e.g., "A1", "B2"), and places their symbol on the grid.
7. Computer (Computer Player)
Represents the computer player that automatically makes random moves.
Methods:
makeMove(Grid grid): The computer selects a random empty square on the grid to make its move.
How to Run
Clone this repository or copy the code into your Java IDE.
Run the Main class to start the game.
Follow the prompts to input player names and choose whether you want to play against another human or the computer.

## Example of Output
Here is an example of how the game might look when running:

Enter name for Player 1: Alice
Do you want to play against another human? (yes/no): no
Computer chose: B2
  1 2 3
A  | | 
B  | O| 
C  | | 
Alice (X), enter your move (e.g., A1, B2): A1
Computer chose: C3
  1 2 3
A X| | 
B  | O| 
C  | |O
Alice (X), enter your move (e.g., A1, B2): B1
Computer chose: A3
  1 2 3
A X| |X
B X| O| 
C  | |O
Alice (X), enter your move (e.g., A1, B2): C1
Computer chose: B3
  1 2 3
A X| |X
B X| O| O
C X| |O
Alice (X) wins!
In this example, Alice plays as 'X' and is playing against the computer, which plays as 'O'. The game alternates between Alice and the computer until one of them wins or the game ends in a draw.


## Future Improvements
- Implement a smarter AI strategy.
- Allow users to choose different board sizes.

## License
This project is open-source and free to use under the MIT License.

