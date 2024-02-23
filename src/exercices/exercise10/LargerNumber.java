package exercices.exercise10;

import exercices.Matrix;

public class LargerNumber {
  private final Matrix matrix = new Matrix();

  public void getHigherNumber(int[][] numbers) {
    int major = numbers[0][0];
    int index = 1;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if (numbers[i][j] > major) {
          major = numbers[i][j];
          index = 1;
        } else if (numbers[i][j] == major) {
          index++;
        }
      }
    }
    matrix.showMatrix(numbers);
    System.out.println("El número mayor en la matriz es: " + major + " y se repite " + index + " veces.");
  }
}
