import java.util.*;
import java.io.*;
public class Print
{
	public static void main (String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Print.in"));
		int c = in.nextInt();
		in.nextLine();
		for(int i = 1; i <= c; i++)
		{
			System.out.println (in.nextLine());
		}
	}
}