public class Constructors {
  private String name;
  private String lastName;

  Constructors(String name, String lastName){
    this.name = name;
    this.lastName = lastName;
  }
  
  public String getName() {
    return name;
  }

  public String getLastName(){
    return lastName;
  }

  public String getFullName() {
    return name + " " + lastName;
  }
}
