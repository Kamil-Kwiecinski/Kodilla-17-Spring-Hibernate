import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private final List<SudokuElement> row = new ArrayList<>();
    private int numberRow;

    public SudokuRow(int size) {
        for (int i = 0; i < size; i++) {
            SudokuElement sudokuElement = new SudokuElement(size);
            sudokuElement.setX(i);
            this.row.add(sudokuElement);
        }
    }

    public int getNumberRow() {
        return numberRow;
    }
    public void setNumberRow(int numberRow) {
        this.numberRow = numberRow;
    }
    public List<SudokuElement> getElementsInRow() {
        return row;
    }
}
