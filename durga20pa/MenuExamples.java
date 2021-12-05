import javax.swing.*; 

class MenuExamples  
{  
          JMenu file,edit;  
          JMenuItem i1, i2, i3, i4, i5,j1,j2,j3;  
       MenuExamples()
        {  
         JFrame f= new JFrame("Menu and MenuItem Example");  
          
          JMenuBar mb=new JMenuBar();
  
          file=new JMenu("File");  
          edit=new JMenu("Edit");  
          
          i1=new JMenuItem("New");  
          i2=new JMenuItem("Open");  
          i3=new JMenuItem("Save"); 
          i4=new JMenuItem("Exit");  
        
          file.add(i1); 
          file.add(i2);
          file.add(i3); 
          file.add(i4); 
      
          mb.add(file);
//
j1=new JMenuItem("Cut");
j2=new JMenuItem("Copy");
j3=new JMenuItem("Paste");
edit.add(j1);
edit.add(j2);
edit.add(j3);
mb.add(edit);
//
        

          f.setJMenuBar(mb);  
          f.setSize(400,500);  
          f.setLayout(null);
          f.setVisible(true);  
     } 

public static void main(String args[])  
  {  
    MenuExamples m=new MenuExamples(); 
   
  }
  
}