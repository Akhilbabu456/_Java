import java.util.Scanner;

public class Switch {

  public static void main(String arg[]) {
    System.out.println(
      "Enter:\n# 1 for Biriyani \n# 2 for Dosa\n# 3 for Chappathi\n# 4 for Idiyappam\n# 5 for Appam"
    );
    Scanner s = new Scanner(System.in);
    int choice = s.nextInt();
    System.out.println("Your choice is:\n");
    switch (choice) {
      case 1:
        System.out.println("@ Biriyani");
        break;
      case 2:
        System.out.println("@ Dosa");
        break;
      case 3:
        System.out.println("@ Chappathi");
        break;
      case 4:
        System.out.println("@ Idiyappam");
        break;
      case 5:
        System.out.println("@ Appam");
        break;
      default:
        System.out.println("@ Choose from the above options.");
        break;
    }
  }
}
