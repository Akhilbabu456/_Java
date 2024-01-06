import java.util.Scanner;

public class ArraySortingDescending {

  public static void main(String ar[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter array limit :");
    int limit = s.nextInt();
    System.out.println("Enter array elements: ");
    int a[] = new int[limit];
    for (int i = 0; i < limit; i++) {
      a[i] = s.nextInt();
    }
    int temp;
    for (int i = 0; i < limit - 1; i++) {
      for (int j = i + 1; j < limit; j++) {
        if (a[i] < a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    System.out.println("sorted value descending: ");
    for (int i = 0; i < limit; i++) {
      System.out.println(a[i]);
    }
  }
}
