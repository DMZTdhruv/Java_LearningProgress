class Counter {
  class Idk{
    public void printIdk(){
      System.out.println("hello idk");
    }
  }

  int count = 0;
  public synchronized void increment(){
    count++;
  }
}
public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter();
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run(){
        for(int i=0;i<1000;i++) {
          counter.increment();
        } 
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run(){
        for(int i=0;i<1000;i++) {
          counter.increment();
        } 
      }
    });


    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(counter.count);
  }
}

