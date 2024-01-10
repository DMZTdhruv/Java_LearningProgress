import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
  public static void main(String[] args) {
    ArrayList<String> food = new ArrayList<>();
    ArrayList<Integer> no = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    no.add(1);
    food.add("Pizza");
    no.add(2);
    food.add("Ramen");
    no.add(3);
    food.add("IceCream");

    System.out.println("Your order is: ");
    for(int i=0;i<food.size();i++){
      System.err.println(no.get(i) + ": " + food.get(i));
    }

    System.out.println("Do you want to change the order? Type 'true' or 'false'\n");
    boolean changeOrder = scanner.nextBoolean();
    scanner.nextLine();

    if (changeOrder == true) {
      System.out.println("Please enter the index of the order you want to change: ");
      int indexOfFood = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Please enter the food name now: ");
      String nameOfFood = scanner.nextLine();

      food.set(indexOfFood - 1, nameOfFood);
      System.out.println("Your new order has been set successfully your new order is: ");
      for(int i=0;i<food.size();i++){
        System.err.println(no.get(i) + ": " + food.get(i));
      }
      
      System.out.println("Thank you for choosing our restaurant your order will be delivered in few seconds");
    } else {
      System.out.println("Thank you for choosing our restaurant your order will be delivered in few seconds");
    }
    scanner.close();
  }
}
