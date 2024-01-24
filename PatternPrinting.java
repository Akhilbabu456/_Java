import java.util.Scanner;

public class PatternPrinting {

  public static void main(String arg[]) {
    System.out.println("Enter a number: ");
    Scanner s = new Scanner(System.in);
    int limit = s.nextInt();
    for (int i = 1; i <= limit; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" # ");
      }
      System.out.println();
    }
    for (int i = 0; i <= limit; i++) {
      for (int j = i + 1; j <= limit; j++) {
        System.out.print(" # ");
      }
      System.out.println();
    }
  }
}
