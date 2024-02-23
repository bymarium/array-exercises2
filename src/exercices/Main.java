package exercices;

import exercices.exercise3.SumOfRowsAndColumns;
import exercices.exercise4.ColumnTotal;

import java.util.Scanner;

public class Main {
  public static final Scanner reader = new Scanner(System.in);


  public static void main(String[] args) {
    final ColumnTotal columnTotal = new ColumnTotal();

    columnTotal.majorColumn();

  }

}