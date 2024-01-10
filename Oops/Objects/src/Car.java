public class Car {
  String color = "red";
  String name;

  Car(String name){
    this.name = name;
  }

  Car(){}

  void drive(){
    System.out.println("You are driving a tesla");
  }
  void stop(){
    System.out.println("You are breaking the car");
  }
}
