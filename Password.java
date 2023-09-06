import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password implements ActionListener {
    JFrame frame;
    String getAPassword;
    JLabel mylabel, title, pass;
    JTextField textField1;
    JButton button;
    ImageIcon background = new ImageIcon(this.getClass().getResource("sec.jpeg"));

    public Password() {
        GUI();

        form();
        background();
        frame.setVisible(true);

    }

    public void GUI() {
        frame = new JFrame("the password");
        frame.setSize(650, 650);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        System.out.println(getClass());
    }

    public void background() {
        mylabel = new JLabel(background);
        mylabel.setBounds(0, 0, 650, 650);
        frame.add(mylabel);
    }

    public void form() {
        title = new JLabel("password Protection");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setForeground(Color.red);
        title.setSize(300, 30);
        title.setLocation(200, 30);
        frame.getContentPane().add(title);


        pass = new JLabel("enter a password");
        pass.setFont(new Font("Arial", Font.ITALIC, 25));
        pass.setForeground(Color.white);
        pass.setSize(300, 30);
        pass.setLocation(50, 100);
        frame.add(pass);

//       this is a text field
        textField1 = new JPasswordField(15);
        textField1.setSize(200, 30);
        textField1.setLocation(50, 130);
        frame.add(textField1);

        button = new JButton("submit");
        Dimension size = button.getPreferredSize();
        button.setBounds(50, 170, size.width + 10, size.height + 10);
        frame.add(button);

//        action Listener
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getAPassword=textField1.getText();
        System.out.println(getAPassword);
    }
}