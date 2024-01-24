package Calculator;

import java.util.Scanner;

public class Main {

  public static void main(String arg[]) {
    Addition add = new Addition();
    Substraction sub = new Substraction();
    Multiplication mul = new Multiplication();
    Division div = new Division();
    System.out.println("Enter two number: ");
    Scanner s = new Scanner(System.in);
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    System.out.println(
      "Choose which operation to perform:\n@ 1 for addition.\n@ 2 for substraction.\n@ 3 for multiplication.\n@ 4 for division."
    );
    int choice = s.nextInt();
    switch (choice) {
      case 1:
        add.sum(num1, num2);
        add.display();
        break;
      case 2:
        sub.display(num1, num2);
        break;
      case 3:
        mul.display(num1, num2);
        break;
      case 4:
        div.display(num1, num2);
        break;
      default:
        System.out.println("@ Enter from options.");
    }
  }
}
