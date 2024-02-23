package exercices.exercise1;

import exercices.Matrix;

public class SumOfNumber {
    private final Matrix matrix = new Matrix();
    public int numberAddition(int[][] numbers) {
      int add = 0;

      for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers.length; j++) {
          add += numbers[i][j];
        }
      }

      matrix.showMatrix(numbers);
      System.out.println("La suma de los números almacenados de la matriz es: " + add);
      return add;
    }
  }

