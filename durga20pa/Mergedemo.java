import java.io.*;


public class Mergedemo
{
	public static void main(String[] args) throws IOException
	{
	                 System.out.println("\t\tMERGING FILES");
                                  System.out.println("\t\t______________");
                                  PrintWriter pw = new PrintWriter("MCA2.txt");
                                  BufferedReader br = new BufferedReader(new FileReader("MCA.txt"));

                                   String line = br.readLine();
		
		while (line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		
		br = new BufferedReader(new FileReader("MCA1.txt"));
		
		line = br.readLine();
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		
		System.out.println("Two Files are Merged Successfully");
	}
}
