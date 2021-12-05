import java.util.LinkedList;
import java.util.Iterator;
public class IteratorExample 
{
 public static void main(String[] args) 
 {
    LinkedList<String> list = new LinkedList<String>();
 
    list.add("A");
    list.add("N");
    list.add("J");
    list.add("A");
    list.add("C");
 
    Iterator it = list.iterator();
    System.out.println("LinkedList elements are:");
    while(it.hasNext())
	{
       System.out.println(it.next());
    }
 }
}