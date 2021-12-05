import java.util.*;
class DemoList
{
	LinkedList <Object> linkedlist = new LinkedList<Object>();
	
	public void push(Object elements)
	{
		linkedlist.addFirst(elements);
		
	}
	
	public Object pop()
	{
		return linkedlist.removeFirst();

	}
	public Object peek()
	{
		return linkedlist.getFirst();

	}
	
}
public class DemoLinkedList
{
  public static void main(String args[])
 {
   Scanner reader = new Scanner(System.in);
   DemoList obj  = new DemoList();
   char choose;
 do
{
   System.out.println("Select A key..\n1.Push(Add the values in stack)\n2.Top(First element in stack)\n3.Pop(Delete first element in stack)\n4.Traversal(display all elements in stack)");
  int key = reader.nextInt();
  switch(key)
{
   case 1:
       System.out.println("Enter a values add elements in Stack: ");
       int elements = reader.nextInt();
      obj.push(elements);
     System.out.println("The element "+elements+ " added in stack successfully");
    break;
case 2:
          System.out.println("Top of the stack value is :"+obj.peek());
         break;
         case 3:
          System.out.println("The element "+obj.pop()+" popped in stack successfully");	
          break;
case 4:
             System.out.println("\nCurrent stack values : ");
            for(int i =0 ; i<obj.linkedlist.size();i++)
          {
	System.out.println("|"+obj.linkedlist.get(i)+"|");
	System.out.println("-----");
           }
	break;
default:
              System.out.println("Youre select a invalid key..selectOne Valid");
}
 System.out.println("\nDo you want continue..??Press y..Otherwise press no");
choose = reader.next().charAt(0);
}while(choose == 'y');
}
}