import java.util.Scanner;

public class TotalEvensInArray {

  public static void main(String a[]) {
    System.out.println("Enter array limit:");
    Scanner s = new Scanner(System.in);
    int limit = s.nextInt();
    int ar[] = new int[limit];
    System.out.println("Enter array elements:");
    for (int i = 0; i < limit; i++) {
      ar[i] = s.nextInt();
    }
    int even = 0;
    for (int i = 0; i < limit; i++) {
      if (ar[i] % 2 == 0) {
        even = even + 1;
      }
    }
    System.out.println("Even numbers : " + even);
  }
}
