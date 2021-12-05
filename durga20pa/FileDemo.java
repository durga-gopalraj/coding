import java.io.File;
import java.io.IOException;

public class  FileDemo {
public static void main(String[] args)throws IOException {
System.out.println("File names");
System.out.println("-------------");

int count=0;
File f=new File("d:\\durga20pa");
String[] s=f.list();
for(String s1:s) {
  count++;
  System.out.println(s1);
}

System.out.println("\n");
System.out.println("File Directory:" +f.getParent());
System.out.println("File Path:" +f.getPath());
System.out.println("Total number of files : "+count);
}
}