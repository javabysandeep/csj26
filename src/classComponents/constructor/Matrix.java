package classComponents.constructor;

public class Matrix {
    int numberOfRows;
    int numberOfColumns;

    public Matrix(int numberOfRows, int numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(5,5);
        System.out.println("No. of rows " + matrix.getNumberOfRows());
        System.out.println("No. of columns " + matrix.getNumberOfColumns());
    }
}
