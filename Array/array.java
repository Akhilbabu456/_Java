import java.util.Scanner;

public class Array {

  public static void main(String a[]) {
    System.out.println("enter array limit:");
    Scanner s = new Scanner(System.in);
    int limit = s.nextInt();
    System.out.println("enter array elemnets:");
    int ar[] = new int[limit];
    for (int i = 0; i < limit; i++) {
      ar[i] = s.nextInt();
    }
    System.out.println("array elements:");
    for (int i = 0; i < limit; i++) {
      System.out.println(ar[i]);
    }
  }
}
