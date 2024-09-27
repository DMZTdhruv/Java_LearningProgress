public class Outside {
  String outside = "Hello, ";
  public class Inside {
    String inside = "World!";

    public void greetings () {
      System.out.println(outside + " " + inside);
    }
  }
}
