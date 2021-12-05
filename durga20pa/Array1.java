import java.util.*;
class Array1 extends Thread
{
  String[] arr=new String[]{"durga","devi","gowsi","gayu"};
   public void run()
  {
     for(int i=0;i<arr.length;i++)
     {
         try
         {
           System.out.println("Name"+i+":"+arr[i]);
           Thread.sleep(1000);
          }
          catch(InterruptedException e)
         {
              System.out.println(e);
          }
      }
   }
public static void main(String args[])
{
   Array1 a=new Array1();
    a.start();
}
}