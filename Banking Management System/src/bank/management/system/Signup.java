package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java .awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;// importing the package form internet for data of birth


public class Signup extends JFrame implements ActionListener{
 JRadioButton r1,r2,r3,m1,m2,m3;
 JButton next;
JTextField textName,textFName,textMName,textEmail,textMs,textAdd,textCT,textPin,textST;
JDateChooser dateChoser;
    Random ran=new Random();
    Long first4=(ran.nextLong()% 9000L)+1000L;
    String first=" "+Math.abs(first4);
    Signup(){
       super("Application Form") ;
       // IMAGE
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank1.png"));
        Image i2=i1.getImage().getScaledInstance(180,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        //

        JLabel label1=new JLabel("Application Form Number:" +first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page No 1");
        label2.setBounds(330,70,300,27);
        label2.setFont(new Font("Raleway",Font.BOLD,23));
        add(label2);



        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(290,110,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);
//for name
        JLabel lablename=new JLabel("Enter your name:");
        lablename.setBounds(100,170,600,20);
        lablename.setFont(new Font("Raleway",Font.BOLD,20));
        add(lablename);
//this box is for Name
        textName=new JTextField(15);
        textName.setBounds(325,170,430,20);
        textName.setFont(new Font("Arial",Font.BOLD,14));
        add(textName);

        //for father name

        JLabel lableFname=new JLabel("Enter Father's name:");
        lableFname.setBounds(100,200,600,20);
        lableFname.setFont(new Font("Raleway",Font.BOLD,20));
        add(lableFname);
        //text field for father name

        textFName=new JTextField(15);
        textFName.setBounds(325,200,430,20);
        textFName.setFont(new Font("Arial",Font.BOLD,14));
        add(textFName);


        //Label for mathers name
        JLabel lableMname=new JLabel("Enter Mother's name:");
        lableMname.setBounds(100,230,600,20);
        lableMname.setFont(new Font("Raleway",Font.BOLD,20));
        add(lableMname);

       ; textMName=new JTextField(15);
     textMName.setBounds(325,230,430,20);
     textMName.setFont(new Font("Arial",Font.BOLD,14));
     add(textMName);


        //for Dte of birth
        JLabel DOB=new JLabel("Date of birth:");
        DOB.setBounds(100,270,600,20);
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(DOB);


        dateChoser=new JDateChooser();
        dateChoser.setForeground(new Color(105,105,105));
        dateChoser.setBounds(325,270,300,20);
        add(dateChoser);
//for gender

     JLabel labelG=new JLabel("Gender    :");
     labelG.setFont(new Font("Raleway",Font.BOLD,20));
     labelG.setBounds(100,300,600,20);
     add(labelG);

     r1=new JRadioButton("Male");
     r1.setBackground(new Color(222,255,228));
     r1.setFont(new Font("Raleway",Font.BOLD,14));
     r1.setBounds(310,300,60,30);
     add(r1);

     r2=new JRadioButton("Female");
     r2.setBackground(new Color(222,255,228));
     r2.setFont(new Font("Raleway",Font.BOLD,14));
     r2.setBounds(400,300,90,30);
     add(r2);

     r3=new JRadioButton("Others");
     r3.setBackground(new Color(222,255,228));
     r3.setFont(new Font("Raleway",Font.BOLD,14));
     r3.setBounds(490,300,90,30);
     add(r3);

     //the below part is only for chose only one button at a time ...,if i dont  not write this part then we can select both button at atime
     ButtonGroup btng=new ButtonGroup();
     btng.add(r1);
     btng.add(r2);
     btng.add(r3);
//for Email
     JLabel LabelEmail=new JLabel("Email Address:");
     LabelEmail.setBounds(100,330,300,30);
     LabelEmail.setFont(new Font("Raleway",Font.BOLD,20));
     add(LabelEmail);
     textEmail=new JTextField(15);
     textEmail.setBounds(325,340,430,20);
     textEmail.setFont(new Font("Arial",Font.BOLD,14));
     add(textEmail);
//for merriage status
     JLabel LabelMS=new JLabel("Merriage Status:");
     LabelMS.setBounds(100,370,300,30);
     LabelMS.setFont(new Font("Raleway",Font.BOLD,20));
     add(LabelMS);
     //add radio button
     m1=new JRadioButton("Yes");
     m1.setBackground(new Color(222,255,228));
     m1.setFont(new Font("Raleway",Font.BOLD,14));
     m1.setBounds(310,370,60,30);
     add(m1);

     m2=new JRadioButton("Not");
     m2.setBackground(new Color(222,255,228));
     m2.setFont(new Font("Raleway",Font.BOLD,14));
     m2.setBounds(400,370,90,30);
     add(m2);

     m3=new JRadioButton("want to marry");
     m3.setBackground(new Color(222,255,228));
     m3.setFont(new Font("Raleway",Font.BOLD,14));
     m3.setBounds(500,370,130,30);
     add(m3);

     ButtonGroup btngg=new ButtonGroup();
     btngg.add(m1);
     btngg.add(m2);
     btngg.add(m3);

//     textMs=new JTextField(15);
//     textMs.setBounds(325,380,430,20);
//     textMs.setFont(new Font("Arial",Font.BOLD,14));
//     add(textMs);
     //for address
     JLabel LabelAddress=new JLabel("Address:");
     LabelAddress.setBounds(100,400,300,30);
     LabelAddress.setFont(new Font("Raleway",Font.BOLD,20));
     add(LabelAddress);
     textAdd=new JTextField(15);
     textAdd.setBounds(325,410,430,20);
     textAdd.setFont(new Font("Arial",Font.BOLD,14));
     add(textAdd);
     //for city

     JLabel LabelCity=new JLabel("Enter City:");
     LabelCity.setBounds(100,450,300,30);
     LabelCity.setFont(new Font("Raleway",Font.BOLD,20));
     add(LabelCity);
     textCT=new JTextField(15);
     textCT.setBounds(325,450,430,20);
     textCT.setFont(new Font("Arial",Font.BOLD,14));
     add(textCT);

     // for pin code
     JLabel LabelPin=new JLabel("Enter Zip Code:");
     LabelPin.setBounds(100,480,300,30);
     LabelPin.setFont(new Font("Raleway",Font.BOLD,20));
     add(LabelPin);
     textPin=new JTextField(15);
     textPin.setBounds(325,480,430,20);
     textPin.setFont(new Font("Arial",Font.BOLD,14));
     add(textPin);
     //for state
     JLabel LabelState=new JLabel("Enter State:");
     LabelState.setBounds(100,510,300,30);
     LabelState.setFont(new Font("Raleway",Font.BOLD,20));
     add(LabelState);
     textST=new JTextField(15);
     textST.setBounds(325,510,430,20);
     textST.setFont(new Font("Arial",Font.BOLD,14));
     add(textST);

     //adding next button on the below of the page
     next=new JButton("Next");
     next.setFont(new Font("Roleway",Font.BOLD,25));
     next.setBounds(626,540,90,30);
     next.setBackground(Color.BLUE);
     next.setForeground(Color.WHITE);
     next.addActionListener(this);
     add(next);


     getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
     String formno=first;
     String name=textName.getText();
     String fname=textFName.getText();
     String mname=textMName.getText();
     String dob=((JTextField)dateChoser.getDateEditor().getUiComponent()).getText();//little bit confusing but interestiong
String gender=null;
if(r1.isSelected()){
 gender="Male";
}else if(r2.isSelected()){
 gender="female";
}else if(r3.isSelected()){
 gender="others";
}
String email=textEmail.getText();
String maritial=null;
if(m1.isSelected()){
 maritial="Married";
}else if(m2.isSelected()){
 maritial="Unmarried";

}else if(m3.isSelected()){
 maritial="want to marry";

}
//
     String address=textAdd.getText();
String city=textCT.getText();
String pincode=textPin.getText();
String state=textST.getText();

try{
 if(textName.getText().equals(" ")){
  JOptionPane.showMessageDialog(null,"Fill all the fields");
 }else {
  Connect con1 = new Connect();
  String Query = " insert into signup(form_no, name, father_name, mother_name,DOB, gender, email, martial_status, address, city, pincode, state) values('" + formno + " ','" + name + " ' ,'" + fname + " ' ,'" + mname + " ','" + dob + " ','" + gender + " ','" + email + " ','" + maritial + " ','" + address + " ','" + city + " ','" + pincode + " ','" + state + " ')";
  con1.ss.executeUpdate(Query);
  new Signup2();//then it will go to the Signup2 class
  setVisible(true);
 }
}catch(Exception E){
 System.out.println(E.getMessage());
}
    }
    public static void main(String[] args) {
       new Signup();
    }
}
