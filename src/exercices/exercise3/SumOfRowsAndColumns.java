package exercices.exercise3;

import exercices.Matrix;

import java.util.Arrays;

public class SumOfRowsAndColumns {
  private final Matrix matrix = new Matrix();
  public int[] addRows(int[][] numbers) {
    int[] addRow = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      int add = 0;
      for (int j = 0; j < numbers[i].length; j++) {
        add += numbers[i][j];
      }
      addRow[i] = add;
    }
    System.out.println("\nEl vector resultante de la suma de las filas es: " + Arrays.toString(addRow));
    return addRow;
  }

  public int[] addColumns(int[][] numbers) {
    int[] addColumn = new int[numbers[0].length];

    for (int i = 0; i < numbers[0].length; i++) {
      int add = 0;
      for (int j = 0; j < numbers.length; j++) {
        add += numbers[j][i];
      }
      addColumn[i] = add;
    }
    System.out.println("\nEl vector resultante de la suma de las columnas es: " + Arrays.toString(addColumn));
    return addColumn;
  }
}
