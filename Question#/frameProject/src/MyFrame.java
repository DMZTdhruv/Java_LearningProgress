import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
  MyFrame() {
    this.setTitle("JAVA SUCKSSS");
    this.setSize(1080,720);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
    
    ImageIcon image = new ImageIcon("download (1).jpg");
    System.out.println(image.getImage());
    this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new Color(0x0E0E0E));
    System.out.println("Hello world");  
  }
}
