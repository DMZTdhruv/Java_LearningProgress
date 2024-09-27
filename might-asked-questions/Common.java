import java.util.Scanner;

public class Common {
  public static void main(String[] args) {
    // factorial();
  } 

  public static void factorial () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of which you want to find the factorial: ");
    int n = scanner.nextInt();
    int fact = 1;
    for(int i = 1; i<=n; i ++) {
      fact = fact * i;
    }

    System.out.println("The factorial of the " + n + " is: " + fact);
    scanner.close();
  }
}
