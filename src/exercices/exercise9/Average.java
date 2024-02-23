package exercices.exercise9;

import exercices.Matrix;

public class Average {
  private final Matrix matrix = new Matrix();

  public void findAverageOfNumbers(int[][] numbers) {
    int add = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        add += numbers[i][j];
      }
    }
    int average = add/(numbers.length * numbers.length);
    matrix.showMatrix(numbers);
    System.out.println("El promedio de la suma de los números de la matriz es: " + average);
  }
}
