public class Car extends Vehicle {
  Car() {
    super("Gt", "v12", 4);
  }
  
  @Override
  void go(){
    System.out.println("The person is driving a car");
  }
}
