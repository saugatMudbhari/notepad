import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
   JFrame f=new JFrame("Notepad");
    private TextArea textArea = new TextArea("");
   public frame()
   {
       f.setVisible(true);
       f.setBounds(10,10,600,600);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       textArea.setFont(new Font("Century Gothic", Font.PLAIN, 16));
       f.add(textArea);
   }
}
