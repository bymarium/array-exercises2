package exercices;

import exercices.exercise5.MatrixToVector;
import exercices.exercise6.VectorSums;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static final Scanner reader = new Scanner(System.in);


  public static void main(String[] args) {
    final VectorSums vectorSums = new VectorSums();
    final Matrix matrix = new Matrix();

    int[][] numbers = matrix.fillMatrix(matrix.size());
    matrix.showMatrix(numbers);

    vectorSums.storeSumsInVector(numbers);

  }

}