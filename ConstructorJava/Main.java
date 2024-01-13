package ConstructorJava;

import java.util.Scanner;

public class Main {

  public static void main(String arg[]) {
    System.out.println("Enter two numbers: ");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    Sample sa = new Sample(a, b);
  }
}
