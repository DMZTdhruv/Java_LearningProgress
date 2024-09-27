public class Greetings {
  public static void greet(){
    System.out.println("Hello world");
  }
  protected static void greetFBI(){
    System.out.println("YO WASSUP");
  }
}

class Idk extends Greetings{
  public static void main(String[] args) {
    greetFBI();
  }
}

class Another {

  public static void main(String[] args) {
    greet();
  }
}

