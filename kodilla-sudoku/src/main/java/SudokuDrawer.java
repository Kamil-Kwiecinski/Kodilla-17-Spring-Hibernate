public enum SudokuDrawer {

//    INSTANCE;
//
//    public String drawBoard(SudokuBoard sudokuBoard,Coordinates coordinates) {
//        StringBuilder board = new StringBuilder();
//        int col = coordinates.getY();
//        int row = coordinates.getX();
//        String spacer = drawSpacer(col, row);
//
//        int counter = 1;
//        for (SudokuRow sudokuRow : sudokuBoard.getBoard()) {
//            if (counter == col) {
//                counter = 0;
//                board.append(sudokuRow.toString(row)).append("\n\n");
//            } else {
//                board.append(sudokuRow.toString(row)).append("\n").append(spacer).append("\n");
//            }
//            counter++;
//        }
//        return board.toString();
//    }
}
