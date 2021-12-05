import java.util.*;
class Array2 extends Thread
{
public static void main(String args[])
{
   ArrayList<String> a= new ArrayList<String>();
   a.add("Durga");
   a.add("Devi");
   a.add("Gowsi");
   a.add("Gayu");
   System.out.println(a);

for(String name:a)
{
   try
  {
      System.out.println("Name:" +name);
      Thread.sleep(1000);
   }
    catch(InterruptedException e)
    {
        System.out.println(e);
     }
 }
   
}
}
  

   
