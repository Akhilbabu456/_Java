import java.util.Scanner;

public class Function {

  public static void main(String a[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int x = s.nextInt();
    int b = s.nextInt();
    int result = sum(x, b);
    System.out.println("result is : " + result);
  }

  static int sum(int a, int b) {
    int sum = a + b;
    return sum;
  }
}
