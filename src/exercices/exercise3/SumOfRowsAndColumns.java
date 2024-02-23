package exercices.exercise3;

import exercices.Matrix;

public class SumOfRowsAndColumns {
  private final Matrix matrix = new Matrix();
  public void addRows(int[][] numbers) {
    int[] addRow = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      int add = 0;
      for (int j = 0; j < numbers[i].length; j++) {
        add += numbers[i][j];
      }
      addRow[i] = add;
    }

  }

  public void addColumns(int[][] numbers) {
    int[] addColumn = new int[numbers.length];

    for (int i = 0; i < numbers[0].length; i++) {
      int add = 0;
      for (int j = 0; j < numbers.length; j++) {
        add += numbers[i][j];
      }
      addColumn[i] = add;
    }
    System.out.println("El vector resultante de la suma de las columnas es: " );
  }
}
