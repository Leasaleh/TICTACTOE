
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

## Installation and Usage
### Prerequisites
- Java Development Kit (JDK) installed

### Running the Game
1. Clone or download the repository.
2. Navigate to the project folder.
3. Compile the Java files:
   ```sh
   javac p2/*.java
   ```
4. Run the game:
   ```sh
   java p2.Main
   ```

## Code Structure
### Classes and Methods

#### `Game`
- `public Game()`: Initializes the game board and players.
- `private void choosePlayers()`: Asks the user to choose between human or computer opponent.
- `public void play()`: Manages the game loop and checks for a win/draw.

#### `Grid`
- `public Grid()`: Initializes the game board.
- `public void display()`: Displays the current board state.
- `public boolean makeMove(char row, int col, char symbol)`: Places a move if the spot is available.
- `public boolean checkWin(char symbol)`: Checks if a player has won.
- `public boolean isFull()`: Determines if the board is full.

#### `Player` (Abstract class)
- `protected char symbol`: Player's symbol (`X` or `O`).
- `protected String name`: Player's name.
- `public char getSymbol()`: Returns the player's symbol.
- `public String getName()`: Returns the player's name.
- `public abstract void makeMove(Grid grid)`: Abstract method for making a move.

#### `Human` (Extends `Player`)
- `public Human(char symbol, String name)`: Constructor for human players.
- `public void makeMove(Grid grid)`: Handles human player input.

#### `Computer` (Extends `Player`)
- `public Computer(char symbol)`: Constructor for computer player.
- `public void makeMove(Grid grid)`: Makes a random move on the board.

#### `Square`
- `private char value`: Represents the value in a square (`X`, `O`, or empty).
- `public Square()`: Initializes a square as empty.
- `public char getValue()`: Returns the square's value.
- `public void setValue(char value)`: Sets the square's value.

## Example Output
```
Enter name for Player 1: Alice
Do you want to play against another human? (yes/no): no

  1 2 3
A  | | 
B  | | 
C  | | 

Alice (X), enter your move (e.g., A1, B2): A1

  1 2 3
A X| | 
B  | | 
C  | | 

Computer chose: B2

  1 2 3
A X| | 
B  |O| 
C  | | 

...

Alice (X) wins!
```

## Future Improvements
- Implement a smarter AI strategy.
- Allow users to choose different board sizes.

## License
This project is open-source and free to use under the MIT License.

