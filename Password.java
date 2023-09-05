import javax.swing.*;

public class Password {
    JFrame frame;
    JLabel mylabel;
    ImageIcon background = new ImageIcon(this.getClass().getResource("sec.jpeg"));

    public Password() {
        GUI();

    }

    public void GUI() {
        frame = new JFrame("the password");
        frame.setSize(650, 650);
        background();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        System.out.println(getClass());
    }

    public void background() {
        mylabel = new JLabel(background);
        mylabel.setBounds(0, 0, 650, 650);
        frame.add(mylabel);

    }
}