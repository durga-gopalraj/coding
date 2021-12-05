import java.awt.*;

public class LoginDemo extends Frame
{
  Label lname,lpass;
  TextField tname,tpass;
  Button bok,bcancel;
  Panel p1,p2;
  LoginDemo()
{
   lname=new Label("Username");
   lpass=new Label("Password");
   tname=new TextField();
   tpass=new TextField();
   bok=new Button("OK");
   bcancel=new Button("Cancel");

   p1=new Panel();
   p1.setLayout(new GridLayout(2,2));
    
   p1.add(lname);
   p1.add(tname);
   p1.add(lpass);
   p1.add(tpass);
 
    p2=new Panel();
    p2.add(bok);
    p2.add(bcancel);

   this.add("Center",p1);
   this.add("South",p2);

   this.setTitle("Login Screen");
   this.setLocation(300,300);
   this.setSize(500,250);
   this.setBackground(Color.cyan);
   this.setForeground(Color.red);
   this.setVisible(true);
}

public static void main(String args[])
{
  LoginDemo l=new LoginDemo();
}

}