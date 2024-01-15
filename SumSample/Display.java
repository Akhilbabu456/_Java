package SumSample;

public class Display {

  int a;
  int b;
  int c;

  void sum() {
    c = a + b;
  }

  void display() {
    sum();
    System.out.println("Sum: " + c);
  }
}
