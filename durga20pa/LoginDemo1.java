import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginDemo1 extends JFrame implements ActionListener
{
  JLabel lname,lpass;
  JTextField tname,tpass;
  JButton bok,bcancel,bexit;
  JPanel p1,p2;
  LoginDemo1()
{
   lname=new JLabel("Username");
   lpass=new JLabel("Password");
   tname=new JTextField();
   tpass=new JTextField();
   bok=new JButton("OK");
   bok.addActionListener(this);
   bcancel=new JButton("Cancel");
   bcancel.addActionListener(this);
   bexit=new JButton("Exit");
   bexit.addActionListener(this);

   p1=new JPanel();
   p1.setLayout(new GridLayout(2,2));
    
   p1.add(lname);
   p1.add(tname);
   p1.add(lpass);
   p1.add(tpass);
 
    p2=new JPanel();
    p2.add(bok);
    p2.add(bcancel);
    p2.add(bexit);

   this.add("Center",p1);
   this.add("South",p2);

   this.setTitle("Login Screen");
   this.setLocation(300,300);
   this.setSize(500,250);
   this.setBackground(Color.cyan);
   this.setForeground(Color.red);
   this.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{ 
  String uname,upass="";
  uname=tname.getText();
  upass=tpass.getText();
  
   if(ae.getSource()==bok)
   {
      if(uname.equals("Durga")&&upass.equals("Durga123"))
      {
          System.out.println("Valid User");
       }
      else
      {
         System.out.println("Invalid User");
      }
   }
      if(ae.getSource()==bcancel)
     {
        tname.setText("");
        tpass.setText("");
      }
     if(ae.getSource()==bexit)
     {
           System.exit(0);
      }
}
public static void main(String args[])
{
  LoginDemo1 l=new LoginDemo1();
}

}