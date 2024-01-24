import java.util.Scanner;

public class MultiDimensionalArray {

  public static void main(String arg[]) {
    System.out.println("Enter array limit: ");
    Scanner s = new Scanner(System.in);
    int limit = s.nextInt();
    System.out.println("Enter array elements: ");
    int a[][] = new int[limit][limit];
    for (int i = 0; i < limit; i++) {
      for (int j = 0; j < limit; j++) {
        a[i][j] = s.nextInt();
      }
    }
    System.out.println("Entered array elements: ");
    for (int i = 0; i < limit; i++) {
      for (int j = 0; j < limit; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
  }
}
