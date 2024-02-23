package exercices.exercise13;

import exercices.Matrix;

import java.util.Arrays;

public class UpperDiagonal {
  private final Matrix matrix = new Matrix();

  public void printToDiagonal(int[][] numbers) {
    int[] diagonal = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if (i == j) {
          diagonal[i] = numbers[i][j];
        }
      }
    }
    matrix.showMatrix(numbers);
    System.out.println("\nLa diagonal superior de la matriz es: " + Arrays.toString(diagonal));
  }
}
