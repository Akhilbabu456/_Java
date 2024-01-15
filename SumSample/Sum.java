package SumSample;

import java.util.Scanner;

public class Sum {

  public static void main(String arg[]) {
    Display d1 = new Display();
    Display d2 = new Display();
    System.out.println("Enter the numbers: ");
    Scanner s = new Scanner(System.in);
    d1.a = s.nextInt();
    d1.b = s.nextInt();
    System.out.println("Enter the numbers: ");
    d2.a = s.nextInt();
    d2.b = s.nextInt();
    System.out.println("Sum of first entered value: ");
    d1.display();
    System.out.println("Sum of second entered value: ");
    d2.display();
  }
}
