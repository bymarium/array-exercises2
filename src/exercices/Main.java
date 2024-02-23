package exercices;

import exercices.exercise3.SumOfRowsAndColumns;
import exercices.exercise4.ColumnTotal;
import exercices.exercise5.MatrixToVector;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static final Scanner reader = new Scanner(System.in);


  public static void main(String[] args) {
    final MatrixToVector matrixToVector = new MatrixToVector();
    final Matrix matrix = new Matrix();

    int[][] numbers = matrix.fillMatrix(matrix.size());
    matrix.showMatrix(numbers);

    int[] vector = matrixToVector.convertMatrixToVector(numbers);
    System.out.println("Vector:" + Arrays.toString(vector));

  }

}