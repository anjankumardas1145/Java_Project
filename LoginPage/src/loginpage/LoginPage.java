package loginpage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3, b4, b5, b6;
    JPanel panel;  // New JPanel for background color

    LoginPage() {
        setComponent();
    }

    LoginPage(String s) {
        setComponent();
    }

    public void setComponent() {
        l1 = new JLabel("United School of business Management");
        l1.setForeground(Color.ORANGE); // You can choose any Color you like
        l1.setFont(new Font("Arial", Font.BOLD, 14));
        l2 = new JLabel("Username:");
        l2.setForeground(Color.WHITE);
        l3 = new JLabel("Password:");
        l3.setForeground(Color.WHITE);
        l4 = new JLabel("");
        l4.setForeground(Color.ORANGE); // You can choose any Color you like
        l4.setFont(new Font("Arial", Font.BOLD, 14));
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b2 = new JButton("clear");
        b3 = new JButton("Add");
        b4 = new JButton("sub");
        b5 = new JButton("multiplication");
        b6 = new JButton("Division");

        panel = new JPanel();  // Initialize the JPanel
        panel.setLayout(null); // Use absolute positioning
        panel.setBackground(Color.blue); // Set background color frame

        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);
        panel.add(t1);
        panel.add(t2);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);

        l1.setBounds(200, 30, 300, 25);
        l2.setBounds(100, 50, 100, 25);
        l3.setBounds(100, 80, 100, 35);
        l4.setBounds(220, 230, 300, 25);
        t1.setBounds(200, 60, 300, 25);
        t2.setBounds(200, 90, 300, 25);
        b1.setBounds(200, 120, 110, 25);
        b2.setBounds(400, 120, 100, 25);
        b3.setBounds(250, 150, 100, 25);
        b4.setBounds(360, 150, 100, 25);
        b5.setBounds(250, 190, 100, 25);
        b6.setBounds(360, 190, 100, 25);

        b1.addActionListener(new SubLogin());
        b2.addActionListener(new ClearBTN());
        b3.addActionListener(new Add());
        b4.addActionListener(new Sub());
        b5.addActionListener(new Multi());
        b6.addActionListener(new Division());

        add(panel); // Add JPanel to JFrame
    }

    public static void main(String[] args) {
        LoginPage login = new LoginPage();
        login.setSize(700, 300);
        login.setVisible(true);
        login.setTitle("LoginScreen");
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class SubLogin implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            String S1 = t1.getText();
            String S2 = t2.getText();
            if (S1.equals("Anjan") && S2.equals("Dipi Didi")) {
                l4.setText("Registration Successful  Anjan");
            } else {
                l4.setText("Not Successful ");
            }
        }
    }

    class ClearBTN implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            t1.setText("");
            t2.setText("");
        }
    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                l4.setText("The addition of the numbers is: " + c);
            } catch (Exception p) {
                System.out.println(p.getMessage());
                l4.setText("Please enter valid numbers");
            }
        }
    }

    class Sub implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                l4.setText("The subtraction of the numbers is: " + c);
            } catch (Exception p) {
                System.out.println(p.getMessage());
                l4.setText("Please enter valid numbers ");
            }
        }
    }

    class Multi implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                l4.setText("The multiplication of the numbers is: " + c);
            } catch (Exception p) {
                System.out.println(p.getMessage());
                l4.setText("Please enter valid numbers Dipi ");
            }
        }
    }

    class Division implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                if (b != 0) {
                    int c = a / b;
                    l4.setText("The division of the numbers is: " + c);
                } else {
                    l4.setText("Cannot divide by zero");
                }
            } catch (Exception p) {
                System.out.println(p.getMessage());
                l4.setText("Please enter valid numbers ");
            }
        }
    }
}
