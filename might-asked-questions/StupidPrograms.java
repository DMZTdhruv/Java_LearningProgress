import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.*;

public class StupidPrograms {
  public static void main(String[] args) {
    // simpleInterest();
    // areas();
    // minimumValue();
    // primeNumbers();
    // reverseArray();
    Frames();
  }

  public static void simpleInterest() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the principalAmount");
    float principalAmount = scanner.nextFloat();
    System.out.println("Enter the rate: ");
    float rate = scanner.nextFloat();
    System.out.println("Enter the time: ");
    float time = scanner.nextFloat();
  
    float si = (principalAmount * rate * time) / 100;
    System.out.println("The simple interest is: " + si);
    
    float totalAmount = principalAmount + si;
    System.out.println("The total amount is: " + totalAmount);
    scanner.close();
  }


  public static void areas() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Area of square: ");

    System.out.println("Enter the side: ");
    float n = scanner.nextFloat();
    float area = n * n;
    System.out.println("The are of square is: " + area);



    System.out.println("----------------------------");
    System.out.println("Area of rectangle");
    System.out.println("Enter the length: ");
    float l = scanner.nextFloat();
    System.out.println("Enter the width: ");
    float w = scanner.nextFloat();
    float areaOfRectangle = l * w;
    System.out.println("The area of rectangle is: " + areaOfRectangle);

    scanner.close();
  }

  public static void minimumValue () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first value: ");
    int first = scanner.nextInt();
    System.out.println("Enter the second value: ");
    int second = scanner.nextInt();
    System.out.println("Enter the third value: ");
    int third = scanner.nextInt();



    int min = (first < second) ? (first < third ? first : third) : (second < third ? second : third);
        System.out.println("The minimum value is: " + min);
    scanner.close();
  }
  
  public static void primeNumbers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the nth : ");
    int count = scanner.nextInt();
    for(int i=2;i<=count;i++) {
      if(isPrime(i)){
        System.out.print(i + " ");
      }
    }

    scanner.close();
  }

  public static boolean isPrime(int num) {
    if(num <= 1) {
      return false;
    }

    for(int i = 2;i<=Math.sqrt(num); i++) {
      if(num%i == 0){
        return false;
      }
    }
    return true;
  }

  public static void reverseArray() {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    for(int i = 0;i<arr.length/2;i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }

    for(int i = 0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void Frames () {
    JFrame frame = new JFrame();
    frame.setSize(1536,786);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    

    // checkbox
    JCheckBox checkBox = new JCheckBox();
    panel.add(checkBox);

    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton radioButton1 = new JRadioButton();
    JRadioButton radioButton2 = new JRadioButton();
    
    buttonGroup.add(radioButton1);
    buttonGroup.add(radioButton2);


    panel.add(radioButton1);
    panel.add(radioButton2);

    frame.add(panel);
    frame.setVisible(true);
  }
}
