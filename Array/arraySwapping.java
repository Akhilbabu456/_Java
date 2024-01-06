import java.util.Scanner;

public class ArraySwapping {

  public static void main(String a[]) {
    System.out.println("Enter array limit: ");
    Scanner s = new Scanner(System.in);
    int limit = s.nextInt();
    int ar[] = new int[limit];
    System.out.println("Enter elements of first array: ");
    for (int i = 0; i < limit; i++) {
      ar[i] = s.nextInt();
    }
    int br[] = new int[limit];
    System.out.println("Enter elements of second array: ");
    for (int i = 0; i < limit; i++) {
      br[i] = s.nextInt();
    }
    int temp;
    for (int i = 0; i < limit; i++) {
      temp = ar[i];
      ar[i] = br[i];
      br[i] = temp;
    }
    System.out.println("Swapped first array :");
    for (int i = 0; i < limit; i++) {
      System.out.println(ar[i]);
    }
    System.out.println("Swapped second array :");
    for (int i = 0; i < limit; i++) {
      System.out.println(br[i]);
    }
  }
}
