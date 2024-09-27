import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cool {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // images
    ImageIcon image = new ImageIcon("songkang.jpg");
    JLabel label = new JLabel();
    label.setIcon(image);

    // panels
    JPanel redPanel = new JPanel();
    JPanel mainWindow = new JPanel();
    
    JPanel bluePabel = new JPanel();
    frame.setSize(1536, 726); 
    frame.setLayout(null);

    // Panel colors
    mainWindow.setBackground(Color.blue);
    redPanel.setBackground(Color.red);

    // panel bounds
    redPanel.setBounds(0,0, 300, 726);
    int mainWindowWidth = frame.getWidth() - redPanel.getWidth();
    mainWindow.setBounds(300, 0,mainWindowWidth, 726);
    mainWindow.add(label);
    frame.add(redPanel);
    frame.add(mainWindow);
    frame.setVisible(true);
  }
}
