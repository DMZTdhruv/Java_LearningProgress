public class MyThread extends Thread{
  @Override
  public void run(){
    System.out.println("MyThread is running now " + Thread.currentThread());
  }
}
