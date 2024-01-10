import java.util.Scanner;

public class Operators {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int female = 1;


    System.out.println("There is " + female + " female in the room");
    System.out.println("How many male friends are there: ");
    int friends = scanner.nextInt();
    int babies = 0;

    if (friends > 2) {
      babies = 2;
    } else {
      babies = friends;
    }

    System.out.println("If there is " + female  + " female then babies will be: " + babies);

    scanner.close();
  }
}
