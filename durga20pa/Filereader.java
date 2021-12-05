import java.io.*;
import java.util.*;
class Filereader
{
  public static void main(String[] args)throws IOException
  {
    System.out.println("\t\tFileReader and FileWriter");
    System.out.println("\t\t____________________");
   FileWriter fw=new FileWriter("MCA.txt");
   System.out.println("Enter the text to the file");
   Scanner s= new Scanner(System.in);
   String text=s.next();
   fw.write(text);
 
 FileReader fr=new FileReader("MCA.txt");
 text=text.toLowerCase();
   int Vcount=0,Ccount=0,Wcount=0;
  
   for(int i=0;i<text.length();i++)
   {
      char ch=text.charAt(i);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
         Vcount++;        
      }
  
   else if(text.charAt(i)=='_') 
   {
      Wcount++;
   }
   else 
   {
       Ccount++;
   } 
}
 System.out.println("Vowel Count:" +Vcount);
 System.out.println("Consonant Count:"+Ccount);
 System.out.println("Word Count:"+Wcount);

    fw.flush();
    fw.close();
   fr.close();
}
}