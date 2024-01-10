import javax.swing.JOptionPane;

public class Gui {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Hello " + name);
  
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "You are " + name + " and " + " you are " + age + " years old ");  

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
    if ( height < 168) {
      JOptionPane.showMessageDialog(null, "You are short my friend");
    } else {
      JOptionPane.showMessageDialog(null, "You are chico my friend");
    }
  }
}
