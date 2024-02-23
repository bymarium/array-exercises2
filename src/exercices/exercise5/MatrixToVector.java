package exercices.exercise5;

import exercices.Matrix;

import java.util.Arrays;

public class MatrixToVector {
  private final Matrix matrix = new Matrix();

  public int[] convertMatrixToVector(int[][] numbers) {
    int[] vectorNumbers = new int[numbers.length * numbers.length];
    int index = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        vectorNumbers[index] = numbers[i][j];
        index++;
      }
    }
    matrix.showMatrix(numbers);
    System.out.println("La matriz convertida en vector es: \n" + Arrays.toString(vectorNumbers));
    return vectorNumbers;
  }
}
