package exercices.exercise4;

import exercices.Matrix;
import exercices.exercise3.SumOfRowsAndColumns;

public class ColumnTotal {
  private final Matrix matrix = new Matrix();
  private final SumOfRowsAndColumns sumOfRowsAndColumns = new SumOfRowsAndColumns();


  public void findMajorColumn() {
    int[][] matrixNumbers = matrix.fillMatrix(matrix.size());
    matrix.showMatrix(matrixNumbers);
    int[] vectorColumns = sumOfRowsAndColumns.addColumns(matrixNumbers);

    int major = 0;
    int column = 0;

    for (int i = 0; i < vectorColumns.length; i++) {
      if (vectorColumns[i] > major) {
        major = vectorColumns[i];
        column = i;
      }
    }
    System.out.println("La columna que tuvo la mayor suma fue: " + (column + 1) + " y su total fue: " + major);
  }

}
