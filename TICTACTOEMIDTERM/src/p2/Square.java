package p2;

import java.util.*;

//Represents each square on the grid
class Square {
    private char value;

    public Square() {
        this.value = ' ';
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}
