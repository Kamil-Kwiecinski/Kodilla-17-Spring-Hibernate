import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    public static int EMPTY = -1;
    private final List<Integer> possibleValues = new ArrayList<>();
    private final Coordinates coordinates;

    public SudokuElement(int size) {
        this.coordinates = new Coordinates(-1, -1, EMPTY);
        for (int i = 0; i < size; i++) {
            possibleValues.add(i+1);
        }
    }

    public int getX() {
        return coordinates.getX();
    }

    public int getY() {
        return coordinates.getY();
    }

    public void setX(int x) {
        coordinates.setX(x);
    }

    public void setY(int y) {
        coordinates.setY(y);
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setValue(int value) {
        coordinates.setValue(value);
    }

    public int getValue() {
        return coordinates.getValue();
    }
}
