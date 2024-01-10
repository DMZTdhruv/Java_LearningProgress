import java.util.ArrayList;
import java.util.Scanner;

public class ArrList2 {
  public static void main(String[] args) {

    ArrayList<String> availableVegetables = new ArrayList<>();
    availableVegetables.add("Potato");
    availableVegetables.add("cauliflower");
    availableVegetables.add("broccoli");
    availableVegetables.add("Egg plant");

    ArrayList<String> availableFruit = new ArrayList<>();
    availableFruit.add("Tomato");
    availableFruit.add("Banana");
    availableFruit.add("Orange");
    availableFruit.add("Strawberry");

    ArrayList<String> availableDrinks = new ArrayList<>();
    availableDrinks.add("Vodka");
    availableDrinks.add("Tequila");
    availableDrinks.add("Water");
    availableDrinks.add("Sprite"); 

    //const anotherArr = ["Hello","Meow"]
    //const arr = [anotherArr]
    //const twoD = 
    ArrayList<ArrayList<String>> allItems = new ArrayList<>();
    allItems.add(availableVegetables);
    allItems.add(availableFruit);
    allItems.add(availableDrinks);        
 
    System.out.println("Welcome to your everyday shit shopping center");
    Scanner scanner = new Scanner(System.in);
    System.out.println(allItems.get(2).size());
    scanner.close();
  }
}
