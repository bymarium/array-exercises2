package exercices;

public class Matrix {
  public int size() {
    System.out.println("Ingrese la dimension de la matriz");
    return Main.reader.nextInt();
  }

  public int[][] fillMatrix(int size) {
    int[][] numbers = new int[size][size];
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        numbers[i][j] = (int) (Math.random() * 100 + 1);
      }
    }
    return numbers;
  }



  public int[][] showMatrix(int[][] matrix) {
    System.out.println("Matriz: ");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(" " + matrix[i][j] + "\t");
      }
      System.out.println("");
    }

    return matrix;
  }

  public int[] showVector(int[] vector) {
    for (int i = 0; i < vector.length; i++) {
      System.out.print(" " + vector[i] + "\t");
    }
    return vector;
  }

}
