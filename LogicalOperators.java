import java.util.Scanner;

public class LogicalOperators { 
  public static void main(String[] args) {
    Utils utils = new Utils();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Press Q to quit the game or \nPress C to continue the game");
    String ans = scanner.nextLine();
    if(ans.equals("Q")){
      utils.Println("You have quit the game");
    } else if (ans.equals("C")){
      utils.Println("You are continuing the game");
    } else if (ans.equals("q") || ans.equals("c")){
      utils.Println("Please enter in uppercase");
    }
    
    scanner.close();
  }
}
