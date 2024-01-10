import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
  public static void main(String[] args) {
    // Initializing food items and their price
    ArrayList<Integer> foodItemPrice = new ArrayList<>();

    for(int i=0;i<5;i++){
      foodItemPrice.add((i+1) * 500);
    }

    ArrayList<String> foodItemName = new ArrayList<>();
    foodItemName.add("Broccoli");
    foodItemName.add("Cauliflower");
    foodItemName.add("Tomatoes");
    foodItemName.add("Pizza");
    foodItemName.add("Burger");

    // Displaying all the food items
    displayFoodItems(foodItemName, foodItemPrice);

    // Taking order
    System.out.println("\n------------------------------------------------------------\n");
    System.out.println("Enter the index twice or more for buying a similar Product.\nTo exit enter at the end: 0 \n");
    Boolean exit = false;
    ArrayList<Integer> foodIndex = new ArrayList<>();
    Scanner getIndex = new Scanner(System.in);
    System.out.println("------------------------------------------------------------");
    System.out.println("Please enter the index of the food item you want to buy:\n ");    
    while (!exit){
      int index = getIndex.nextInt();
      if ( index == 0 ){
        exit = true;
        break;
      }
      foodIndex.add(index);
    }
    getIndex.close();

    displayOrderItems(foodItemName, foodItemPrice, foodIndex);

  }

  public static void displayFoodItems(ArrayList<String> name, ArrayList<Integer> price ){
    System.out.println("Welcome to DMXZT space station what would you like to buy: ");
    System.out.println("-----------------------------------------------------------\n");
    for(int i=0;i<name.size();i++ ){
      System.out.println((i+1) + ": " + name.get(i) + " -$" + price.get(i));
    }
  }

  public static void displayOrderItems(ArrayList<String> name, ArrayList<Integer> price, ArrayList<Integer> index){
    if (index.isEmpty()){
      System.out.println("Your list is empty, your total is: $0");
      return;
    }

    System.out.println("Your order is: ");
    int total = 0;
    for(int i=0;i<index.size();i++ ){
      total += price.get(index.get(i)-1);
      if(index.get(i) == 0 ){
        break;
      }
      System.out.println((i+1) + ": " + name.get(index.get(i)-1) + " $" + price.get(index.get(i)-1));
    }
    System.out.println("Your order total is: $" + total);
  }
}
