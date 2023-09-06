import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password implements ActionListener {
    frame frame;
    private JFrame sub_frame;
    String getAPassword;
    String entryWord = "hello123";
    JLabel mylabel, title, pass, errorM;
    JTextField textField1;

    JButton button;
    ImageIcon background = new ImageIcon(this.getClass().getResource("sec.jpeg"));

    public Password() {
        GUI();

        form();
        background();
        sub_frame.setVisible(true);

    }

    public void GUI() {
        sub_frame = new JFrame("the password");
        sub_frame.setSize(650, 650);
        sub_frame.setLayout(null);
        sub_frame.setResizable(false);
        sub_frame.setDefaultCloseOperation(sub_frame.EXIT_ON_CLOSE);
        System.out.println(getClass());
    }

    public void background() {
        mylabel = new JLabel(background);
        mylabel.setBounds(0, 0, 650, 650);
        sub_frame.add(mylabel);
    }

    public void form() {
        title = new JLabel("password Protection");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setForeground(Color.red);
        title.setSize(300, 30);
        title.setLocation(200, 30);
        sub_frame.getContentPane().add(title);


        pass = new JLabel("enter a password");
        pass.setFont(new Font("Arial", Font.ITALIC, 25));
        pass.setForeground(Color.white);
        pass.setSize(300, 30);
        pass.setLocation(50, 100);
        sub_frame.add(pass);

//       this is a text field
        textField1 = new JPasswordField(15);
        textField1.setSize(200, 30);
        textField1.setLocation(50, 130);
        sub_frame.add(textField1);

        button = new JButton("submit");
        Dimension size = button.getPreferredSize();
        button.setBounds(50, 170, size.width + 10, size.height + 10);
        sub_frame.add(button);


//        action Listener
        button.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            getAPassword = textField1.getText();
            System.out.println(getAPassword);
            finalResult();
        }
    }

    public boolean finalResult() {
        if (getAPassword.equals("hello123")) {
            System.out.println("this is form final result and it is true");
            sub_frame.dispose();
            new frame();
            return true;
        } else {
            System.out.println("this is form final result and it is false");
            sub_frame.setVisible(true);
            return false;
        }
    }
}