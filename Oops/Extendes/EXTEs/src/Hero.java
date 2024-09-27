public class Hero extends Person {
  String power;

  Hero(String name, int age, String power) {
    super(age,name);
    this.power = power;
  }

  @Override
  public String toString() {
    return super.toString() + this.power;
  }
}
