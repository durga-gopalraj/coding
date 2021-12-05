import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EBdemo extends JFrame 
{
  JLabel lhead,lname,lnum,lunit;
  JTextField tname,tnum,tunit;
  JButton bsubmit;
  JPanel p1,p2,p3;
  
  EBdemo()
{
  lhead=new JLabel("EB BILL CALCULATION",JLabel.CENTER);
  
  lname=new JLabel("Enter your name");
  lnum=new JLabel("Enter the EB number");
  lunit=new JLabel("No.of Units used");
  tname=new JTextField();
  tnum=new JTextField();
  tunit=new JTextField();
  bsubmit=new JButton("Submit");

 

  p1=new JPanel();
  p1.setLayout(new GridLayout(1,1));
  p1.add(lhead);

  p2=new JPanel();
  p2.setLayout(new GridLayout(3,2));
  p2.add(lname);
  p2.add(tname);
  p2.add(lnum);
  p2.add(tnum);
  p2.add(lunit);
  p2.add(tunit); 

  p3=new JPanel();
  p3.setLayout(new GridLayout(1,1));
  p3.add(bsubmit);

  this.add("North",p1);
  this.add("Center",p2);
  this.add("South",p3);
  

  this.setTitle("EB Bill CALCULATION");
  this.setLocation(300,300);
  this.setSize(500,250);
  this.setBackground(Color.black);
  this.setForeground(Color.white);
   this.setVisible(true);
}

public static void main(String args[])
{
  EBdemo eb=new EBdemo();
}
}