public class overloaded {
  public static void main(String[] args) {
    int x = add(1,2);
    int b = add(1,2,3);
    int c = add(12,3,4,5);
    System.out.println(x);
    System.out.println(b);
    System.out.println(c);
  }

  static int add(int a, int b, int c, int d) {
    return a+b+c+d;
  }
  static int add(int a, int b, int c){
    return a+b+c;
  }
  static int add(int a, int b) {
    return a+b;
  }
}
