import java.util.Scanner;

public class SumLoop {

  public static void main(String a[]) {
    System.out.println("Enter a number:");
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int i;
    int sum = 0;
    for (i = 0; i < x; i++) {
      sum = sum + i;
    }
    System.out.println("Sum of numbers till x is : " + sum);
  }
}
