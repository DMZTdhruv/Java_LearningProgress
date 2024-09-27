public class Main2  {
  
  public static void print(String value){
    System.out.println(value);
  }
  

  class Counter {
    int count = 0;
    public void increment() {
      count++;
    }
  }

  public static void main(String[] args) throws InterruptedException {
  }


  public static void threadPractice() {
    MyThread firstMyThread = new MyThread();
    MyThread secondMyThread = new MyThread();
    MyThread thirdMyThread = new MyThread();

    firstMyThread.setName("First Thread");
    secondMyThread.setName("Second Thread");
    thirdMyThread.setName("Third Thread");
    firstMyThread.setPriority(9);
    secondMyThread.setPriority(10);
    thirdMyThread.setPriority(5);
    firstMyThread.start();
    secondMyThread.start();
    thirdMyThread.start();
  }

  public static void slowThreadExample () throws InterruptedException {
    for (int i=1; i<4; i++) {
      Thread.sleep(1000);
      System.out.println(i);
    }
    System.out.println("You are done!");
  }
  public static void threadExamples () {
    System.out.println(Thread.activeCount());
    System.out.println(Thread.currentThread().getName());
    Thread.currentThread().setPriority(10);
    System.out.println(Thread.currentThread().getPriority());
    System.out.println(Thread.currentThread().isAlive());
  }
}

class P {
  public static void print(String value) {
    System.out.println(value);
  }
}