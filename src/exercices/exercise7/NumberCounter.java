package exercices.exercise7;

import exercices.Matrix;

public class NumberCounter {
  private final Matrix matrix = new Matrix();

  public void findNumbers(int[][] numbers) {
    int zero = 0;
    int positive = 0;
    int negative = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if (numbers[i][j] == 0) {
          zero++;
        }
        if (numbers[i][j] > 0) {
          positive++;
        }
        if (numbers[i][j] < 0) {
          negative++;
        }
      }
    }
    matrix.showMatrix(numbers);
    System.out.println("\nLa cantidad de ceros es: " + zero + "\nLa cantidad de positivos es: " + positive + "\nLa cantidad de negativos es: " + negative);
  }
}
