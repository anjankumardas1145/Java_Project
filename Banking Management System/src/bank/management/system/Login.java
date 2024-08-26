package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;//basically JLable is used for some text in the page
    JTextField textField2;//for the box where we will enter the card number that box
    JPasswordField passwordField3;
    JButton b1,b2,b3;
    Login() {
        super("Banking Management System");
        // Adding a header panel with color
        //COPY FROM CHATGPT NOT IMPORTANT
//        JPanel headerPanel = new JPanel();
//        headerPanel.setBackground(Color.BLUE); // Set your desired color here
//        headerPanel.setLayout(null); // So we can use absolute positioning within the panel
//        headerPanel.setBounds(0, 10, 850, 100); // Position and size of the header panel
//        add(headerPanel);

ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank1.png"));
Image i2=i1.getImage().getScaledInstance(180,100, Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(350,10,100,100);
add(image);


        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(180,100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);
//for  Ankita 
        label1 =new JLabel("WELCOME TO MY BANK PROJECT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,28));
        label1.setBounds(230,125,480,40);
        add(label1);
        //for card number
        label2 =new JLabel("Card No:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);
        //textfield for card number
        textField2 =new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);



//for pin
        label3 =new JLabel("Pin No:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);
        // password field for pin
        passwordField3=new JPasswordField();
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

//Button for Sign up ,sign up ,clear

        //sign in button
        b1=new JButton("Sign In");
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.black);
        b1.setBounds(330,300,100,30);
        b1.addActionListener(this);//
        add(b1);

        // BUTTON FOR CLEAR
        b2=new JButton("Clear");
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.black);
        b2.setBounds(450,300,100,30);
        b2.addActionListener(this);
        add(b2);
//sign Up button

        b3=new JButton("Sign Up");
        b3.setFont(new Font("Arial",Font.BOLD,15));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.black);
        b3.setBounds(330,360,230,30);
        b3.addActionListener(this);
        add(b3);

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg1.jpeg"));
        Image iii2=iii1.getImage().getScaledInstance(850,450, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);



        setLayout(null);
        setSize(850, 480);
        setLocation(450,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
      try{
          //here basicaly check that whick button is clicked by user
        if(e.getSource()==b1)  {

        } else if (e.getSource()==b2) {
            //when someone enter the clear button then text from password field an textfield will clean

            textField2.setText(" ");

            passwordField3.setText(" ");
        } else if (e.getSource()==b3) {

        }
      }catch (Exception E){
          E.printStackTrace();
      }
    }

    public static void main(String[] args) {
     new Login();

    }
}