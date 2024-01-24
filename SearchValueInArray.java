import java.util.Scanner;

public class SearchValueInArray {

  public static void main(String arg[]) {
    System.out.println("Enter array limit: ");
    Scanner s = new Scanner(System.in);
    int limit = s.nextInt();
    System.out.println("Enter array elements: ");
    int a[] = new int[limit];
    for (int i = 0; i < limit; i++) {
      a[i] = s.nextInt();
    }
    System.out.println("Enter the value to search: ");
    int search = s.nextInt();
    int flag = 0;
    int b = 0;
    for (int i = 0; i < limit; i++) {
      if (a[i] == search) {
        b = i + 1;
        flag = 1;
        break;
      }
    }
    if (flag == 0) {
      System.out.println("Value not found");
    } else {
      System.out.println(search + " value found in position " + b);
    }
  }
}
