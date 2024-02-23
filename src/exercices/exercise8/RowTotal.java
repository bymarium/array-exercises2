package exercices.exercise8;

import exercices.Matrix;
import exercices.exercise3.SumOfRowsAndColumns;

public class RowTotal {
  private final Matrix matrix = new Matrix();
  private final SumOfRowsAndColumns sumOfRowsAndColumns = new SumOfRowsAndColumns();


  public void findMajorRow() {
    int[][] matrixNumbers = matrix.fillMatrix(matrix.size());
    matrix.showMatrix(matrixNumbers);
    int[] vectorRows = sumOfRowsAndColumns.addRows(matrixNumbers);

    int major = 0;
    int row = 0;

    for (int i = 0; i < vectorRows.length; i++) {
      if (vectorRows[i] > major) {
        major = vectorRows[i];
        row = i;
      }
    }
    System.out.println("La fila que tuvo la mayor suma fue: " + (row + 1) + " y su total fue: " + major);
  }
}
