import java.util.*;
import java.io.*;
class Challenging
{
	/* 
		The main method needs to have throws IOException at the end.
		If the file does not exist, it is possible for your code to
		result in an exception runtime error.
		The source code DryRun.java and the DryRun.dat need to be in the same folder. 
	*/
	public static void main (String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Challenging.in"));
		String b = in.nextLine();
		int c = 0;
		while(in.hasNextLine())
		{
			if(in.nextLine().equals(b)){
				c = c + 1;
			}
		}
		System.out.println(c-1);
	}
}