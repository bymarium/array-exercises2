package exercices.exercise2;

import exercices.Matrix;

public class PositionNumber {
  private final Matrix matrix = new Matrix();

  public void findNumberPosition(int[][] numbers) {
    int majorNumber = 0;
    int row = 0;
    int column = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if(numbers[i][j] > majorNumber) {
          majorNumber = numbers[i][j];
          row = i;
          column = j;
        }

      }
    }
    matrix.showMatrix(numbers);
    System.out.println("El número mayor de la matriz es: " + majorNumber + " y su posición es: " + "[" + (row + 1) + ", " + (column + 1) + "]");
  }

}
