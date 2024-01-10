public class Switch {
  public static void main(String[] args) {
    String day = "Gibberish";

    switch(day) {
      case "Monday": 
        Print("IT is monday");
      break;
      case "Friday":
        Print("It is Friday");
      break;
      default:
        Print("It is mars");
    }
  }
  public static void Print(String value){
    System.out.println(value);
  }
}
