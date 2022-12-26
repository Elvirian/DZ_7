public class ArrayDataException extends UserException {
    ArrayDataException(int row, int col) {
        super(String.format("Wrong data is in the cell (" + row + " , " + col + ")"));
    }
}