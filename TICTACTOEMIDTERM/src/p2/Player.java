package p2;

//Abstract player class
abstract class Player {
    protected char symbol;
    protected String name;

    public Player(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public abstract void makeMove(Grid grid);
}