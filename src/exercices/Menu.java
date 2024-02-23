package exercices;

import exercices.exercise1.SumOfNumber;
import exercices.exercise2.PositionNumber;
import exercices.exercise3.SumOfRowsAndColumns;
import exercices.exercise4.ColumnTotal;
import exercices.exercise5.MatrixToVector;
import exercices.exercise6.VectorSums;
import exercices.exercise7.NumberCounter;
import exercices.exercise8.RowTotal;
import exercices.exercise9.Average;

public class Menu {
  public void showOptions() {
    System.out.println("\nMenu de opciones: " +
            "\n1. Sumar los números almacenados en una matriz." +
            "\n2. Hallar el número y la posición del número mayor de la matriz." +
            "\n3. Calcular suma de cada fila y columna." +
            "\n4. Sumar columnas y hallar el resultado mayor entre columnas.  " +
            "\n5. Almacenar una matriz en un vector. " +
            "\n6. Almacenar sumas de filas y columnas en un vector." +
            "\n7. Hallar números ceros, positivos y negativos de una matriz." +
            "\n8. Sumar filas y hallar el resultado mayor entre filas. " +
            "\n9. Hallar promedio de los datos de la matriz. " +
            "\n10. Hallar número mayor y veces que se repite " +
            "\n11. Buscar la cantidad de numeros primos " +
            "\n12. Hallar los numeros pares e impares " +
            "\n13. Imprimir la diagonal superior " +
            "\n14. Salir");
  }

  public int getOption() {
    return Main.reader.nextInt();
  }

  public void selectOption() {
    showOptions();
    int option = getOption();
    int[][] numbers;
    Matrix matrix = new Matrix();

    switch (option) {
      case 1:
        SumOfNumber sumOfNumber = new SumOfNumber();
        numbers = matrix.fillMatrix(matrix.size());
        sumOfNumber.numberAddition(numbers);
        selectOption();
        break;
      case 2:
        PositionNumber positionNumber = new PositionNumber();
        numbers = matrix.fillMatrix(matrix.size());
        positionNumber.findNumberPosition(numbers);
        selectOption();
        break;
      case 3:
        SumOfRowsAndColumns sumOfRowsAndColumns = new SumOfRowsAndColumns();
        numbers = matrix.fillMatrix(matrix.size());
        sumOfRowsAndColumns.addRows(numbers);
        sumOfRowsAndColumns.addColumns(numbers);
        selectOption();
        break;
      case 4:
        ColumnTotal columnTotal = new ColumnTotal();
        columnTotal.findMajorColumn();
        selectOption();
        break;
      case 5:
        MatrixToVector matrixToVector = new MatrixToVector();
        numbers = matrix.fillMatrix(matrix.size());
        matrixToVector.convertMatrixToVector(numbers);
        selectOption();
        break;
      case 6:
        VectorSums vectorSums = new VectorSums();
        numbers = matrix.fillMatrix(matrix.size());
        vectorSums.storeSumsInVector(numbers);
        selectOption();
        break;
      case 7:
        NumberCounter numberCounter = new NumberCounter();
        numbers = matrix.fillMatrix(matrix.size());
        numberCounter.findNumbers(numbers);
        selectOption();
        break;
      case 8:
        RowTotal rowTotal = new RowTotal();
        rowTotal.findMajorRow();
        selectOption();
        break;
      case 9:
        Average average = new Average();
        numbers = matrix.fillMatrix(matrix.size());
        average.findAverageOfNumbers(numbers);
        selectOption();
        break;
      case 10:
        selectOption();
        break;
      case 11:
        selectOption();
        break;
      case 12:
        selectOption();
        break;
      case 13:
        selectOption();
        break;
      case 14:
        break;
      default:
        System.out.println("Opción invalida");
        selectOption();
    }
  }
}
