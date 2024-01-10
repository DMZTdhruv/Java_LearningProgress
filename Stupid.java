class IntWrapper {
  int value;

  public IntWrapper(int value) {
    this.value = value;
  }
}

public class Stupid{
  public static void main(String[] args) {
    String name = "Dhruv";
    System.out.println(name);

    IntWrapper x = new IntWrapper(1);
    IntWrapper y = new IntWrapper(2);
    System.out.println("The values of x and y are: " + x + " " + y);
    swap_values(x, y);
    System.out.println("The values of x and y are: " + x + " " + y);
  }

  public static void swap_values(IntWrapper a, IntWrapper b){
    int temp = a.value;
    a.value = b.value;
    b.value = temp;
  }
}