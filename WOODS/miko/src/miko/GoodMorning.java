package miko;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.net.URL;

public class GoodMorning {
   public static void main(String[] args) throws Exception {
      
      JFrame frame = new JFrame("Good Morning!");

      
      URL url = new URL("https://example.com/goodmorning.gif");
      ImageIcon icon = new ImageIcon(url);

     
      JLabel label = new JLabel(icon);

      
      frame.getContentPane().add(label);

     
      frame.pack();

     
      frame.setLocationRelativeTo(null);


      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
      frame.setVisible(true);

     
      System.out.println("Good Morning!");
   }
}

