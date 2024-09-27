import java.net.InetAddress;
import java.util.Scanner;

public class IpAddress {
  public static void main(String[] args){
    try {
      // Program to find the name of an Ip address
      System.out.println("Enter the Ip address: ");
      Scanner sc = new Scanner(System.in);
      String ip = sc.nextLine();
      InetAddress address = InetAddress.getByName(ip);
      System.out.println("The name of the Ip address is: " + address.getHostName());
      sc.close();
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Program executed properly");
    }
  }
}