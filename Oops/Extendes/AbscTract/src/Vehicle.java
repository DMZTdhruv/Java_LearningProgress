public abstract class Vehicle {
  String name;
  String engine;
  int tyres;

  public Vehicle(String name, String engine, int tyres) {
    this.name = name;
    this.tyres = tyres;
    this.engine = engine;
  }

  void displayInfo() {
    System.out.println(name + " " + engine + " " + tyres);
  }
  abstract void go();
}