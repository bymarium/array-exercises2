package exercices;

import exercices.exercise5.MatrixToVector;
import exercices.exercise6.VectorSums;
import exercices.exercise7.NumberCounter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static final Scanner reader = new Scanner(System.in);


  public static void main(String[] args) {
    final NumberCounter numberCounter = new NumberCounter();
    final Matrix matrix = new Matrix();

    int[][] numbers = matrix.fillMatrix(matrix.size());
    numberCounter.findNumbers(numbers);

  }

}