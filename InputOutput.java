import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //Name input
    System.out.println("What is your name? ");
    String name = scanner.nextLine();
    
    //Age
    System.out.println("How old are you? ");
    int age = scanner.nextInt();
    
    //food
    scanner.nextLine();
    System.out.println("What is your favorite food ");
    String Food = scanner.nextLine();


    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old");
    System.out.println("Your name is " + name + " and your favorite food is: " + Food);
    System.out.println("\n");

    scanner.close();
  }  
}
