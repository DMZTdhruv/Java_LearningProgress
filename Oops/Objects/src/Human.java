public class Human {
  String name;
  int age;
  String color;
  int weight;

  Human(String name, int age, int weight, String color){
    this.name = name;
    this.color = color;
    this.age = age;
    this.weight = weight;
  }

  Human(){

  }

  void drink() {
    System.out.println(this.name + " Is burping ");
  } 

  void speak(){
    System.out.println("Hello i'm speaking in a native human language");
  }

  void eat(){
    System.out.println(this.name + " is hungry so he is eating");
  }

}
