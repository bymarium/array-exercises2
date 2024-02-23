package exercices.exercise11;

import exercices.Matrix;

public class PrimeNumber {
  private final Matrix matrix = new Matrix();

  public void findPrimeNumber(int[][] numbers) {
    int number;
    int index = 0;
    matrix.showMatrix(numbers);

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        number = numbers[i][j];
        if (number > 0 ) {
          for (int k = 1; k <= number; k++) {
            if (number % k == 0) {
              index++;
            }
          }

          if (index == 2) {
            System.out.println("El numero " + number + " es primo.");
          }
          index = 0;
        } else {
          System.out.println("Los números negativos no son primos");
        }
      }
    }
  }
}
