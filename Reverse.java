import java.util.Scanner;

public class Reverse {

  public static void main(String arg[]) {
    System.out.println("Enter array limit: ");
    Scanner s = new Scanner(System.in);
    int limit = s.nextInt();
    System.out.println("Enter array elements: ");
    int a[] = new int[limit];
    for (int i = 0; i < limit; i++) {
      a[i] = s.nextInt();
    }
    System.out.println("Reversed array: ");
    for (int i = limit - 1; i >= 0; i--) {
      System.out.println(a[i]);
    }
  }
}
