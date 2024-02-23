package exercices;

import exercices.exercise8.RowTotal;

import java.util.Scanner;

public class Main {
  public static final Scanner reader = new Scanner(System.in);


  public static void main(String[] args) {
    final RowTotal rowTotal = new RowTotal();
    rowTotal.findMajorRow();

  }
}