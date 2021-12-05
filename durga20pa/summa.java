public void actionPerformed(ActionEvent ae)
{ 
  String value,choice;
  value=tvalue.getText();
  choice=combo.getText();
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



bcalc.addActionListener(this);bcancel.addActionListener(this);bexit.addActionListener(this);
