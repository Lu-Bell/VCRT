package vcrtsv3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserFrame implements ActionListener {

    static boolean type;
    static JFrame userView = new JFrame();
    JButton openOwner = new JButton("I am a Vehicle Owner");
    JButton openClient = new JButton("I am a Job Client");

    UserFrame() {

        userView.setLayout(new FlowLayout());

        userView.add(openOwner);
        openOwner.addActionListener(this);

        userView.add(openClient);
        openClient.addActionListener(this);

        userView.setSize(500, 500);
        userView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userView.setVisible(true);
    }

    public static boolean getUserType() {
        return type;
    }

    public static void setUserType(boolean user) {
        type = user;
    }

    public static void hide() {
        userView.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand() == openOwner.getActionCommand()) {
            new OwnerFrame();
        } else if (event.getActionCommand() == openClient.getActionCommand()) {
            setUserType(true);
            new ClientFrame();
        }
    }

}
