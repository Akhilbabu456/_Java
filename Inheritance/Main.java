package Inheritance;

import java.util.Scanner;

public class Main {

  public static void main(String ar[]) {
    Sum su = new Sum();
    System.out.println("Enter two numbers: ");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    su.display(a, b);
    su.displaysum(a, b);
  }
}
