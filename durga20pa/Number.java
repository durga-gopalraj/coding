import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Number extends JFrame 
{
  JLabel lvalue,lnum,lsum,lsum2;
  JTextField tvalue,tnum,tsum,tsum2;
  JButton bcalc,bcancel,bexit;
  JComboBox combo;
  JPanel p1,p2,p3;
 Number()
{
   lvalue=new JLabel("Enter the value of N");
   lnum=new JLabel("Selected number");
   lsum=new JLabel("Sum of N");
   lsum2=new JLabel("Sum of N2");
   
   tvalue=new JTextField();
   tnum=new JTextField();
   tsum=new JTextField();
   tsum2=new JTextField();

   bcalc=new JButton("Calculate");
   
   bcancel=new JButton("Cancel");
   
   bexit=new JButton("Exit");
   
   combo=new JComboBox();

   p1=new JPanel();
   p1.setLayout(new GridLayout(4,2));
    
   p1.add(lvalue);
   p1.add(tvalue);
   p1.add(lnum);
   p1.add(tnum);
   p1.add(lsum);
   p1.add(tsum);
   p1.add(lsum2);
   p1.add(tsum2);
 
    p2=new JPanel();
    p2.add(bcalc);
    p2.add(bcancel);
    p2.add(bexit);
  
   p3=new JPanel();
   p3.add(combo);

   this.add("Center",p1);
   this.add("South",p2);
   this.add("East",p3);

   this.setTitle("Number Display");
   this.setLocation(300,300);
   this.setSize(250,250);
   this.setBackground(Color.cyan);
   this.setForeground(Color.red);
   this.setVisible(true);
}


public static void main(String args[])
{
  Number n=new Number();
}

}