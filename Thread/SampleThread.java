package Thread;

public class SampleThread extends Thread {

  public void run() {
    super.run();
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread count: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
