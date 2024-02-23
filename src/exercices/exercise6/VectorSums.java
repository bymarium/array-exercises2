package exercices.exercise6;

import exercices.Matrix;
import exercices.exercise3.SumOfRowsAndColumns;

import java.util.Arrays;

public class VectorSums {
  private final Matrix matrix = new Matrix();
  private final SumOfRowsAndColumns sumOfRowsAndColumns = new SumOfRowsAndColumns();

  public void storeSumsInVector(int[][] numbers) {
    int[] rows = sumOfRowsAndColumns.addRows(numbers);
    int[] columns = sumOfRowsAndColumns.addColumns(numbers);

    int[] vector = new int[rows.length + columns.length];

    for (int i = 0; i < rows.length; i++) {
      vector[i] = rows[i];
    }
    for (int i = 0; i < columns.length; i++) {
      vector[rows.length + i] = columns[i];
    }

    System.out.println("\nEl vector resultante de las sumas es: " + Arrays.toString(vector));
  }
}
