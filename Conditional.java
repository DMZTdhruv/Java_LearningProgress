import java.util.Scanner;

public class Conditional {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    String ans = checkAge(age);
    System.out.println(ans);
    scanner.close();
  }

  public static String checkAge(int age) {
    if(age >= 18 && age < 65) {
      return "You are an adult now";
    } else if(age >= 65 && age < 100) {
      return "You senior citizen now";
    } else if(age >= 100) {
     return "You are blessed with the aeon of abundance";
    } else {
      return "You are not an adult";
    }
  }
} 
