package exercices.exercise14;

import exercices.Matrix;

public class IdentityMatrix {
  private final Matrix matrix = new Matrix();
  public void fillMatrix(int size) {
    int[][] numbers = new int[size][size];
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if (i == j) {
          numbers[i][j] = 1;
        } else {
          numbers[i][j] = 0;
        }
      }
    }
    matrix.showMatrix(numbers);
  }
}
