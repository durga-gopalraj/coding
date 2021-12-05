import java.awt.*;

public class Loginawt extends Frame
{
  Label larm,lresult;
  TextField tarm,tresult;
  Button bok,bcancel;
  Panel p1,p2;
  Loginawt()
{
   larm=new Label("Enter the Number");
   lresult=new Label("Result");
   tarm=new TextField();
   tresult=new TextField();
   bok=new Button("OK");
   bcancel=new Button("Cancel");

   p1=new Panel();
   p1.setLayout(new GridLayout(2,2));
    
   p1.add(larm);
   p1.add(tarm);
   p1.add(lresult);
   p1.add(tresult);
 
    p2=new Panel();
    p2.add(bok);
    p2.add(bcancel);

   this.add("Center",p1);
   this.add("South",p2);

   this.setTitle("Armstrong Number");
   this.setLocation(300,300);
   this.setSize(500,250);
    this.setBackground(Color.green);
   this.setForeground(Color.redu);
  this.setVisible(true);
}

public static void main(String args[])
{
  Loginawt l=new Loginawt();
}

}