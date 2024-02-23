package exercices.exercise12;

import exercices.Matrix;

public class OddAndEvenNumber {
  private final Matrix matrix = new Matrix();

  public void findEvenNumber(int[][] numbers) {
    int countPar = 0;
    int countOdd = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if(numbers[i][j] % 2 == 0) {
          countPar++;
        } else {
          countOdd++;
        }
      }
    }

    matrix.showMatrix(numbers);
    System.out.println("\nLa cantidad de números pares es: " + countPar + "\nLa cantidad de números impares es: " + countOdd);
  }
}
