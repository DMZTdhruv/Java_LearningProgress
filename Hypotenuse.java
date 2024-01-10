import java.util.Scanner;

public class Hypotenuse {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x,y,z;
    
    System.out.println("Enter your X value: ");
    x = scanner.nextDouble();
    y = scanner.nextDouble();


    z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println("The hypotenuse is: " + z );
    scanner.close();
  } 
}