/* 
	importing java.util.* imports many useful classes but 
	the class we need in this file is the Scanner class.
	importing java.io.* imports the File class and the IOException class.
*/

import java.util.*;
import java.io.*;

public class DryRun
{
	/* 
		The main method needs to have throws IOException at the end.
		If the file does not exist, it is possible for your code to
		result in an exception runtime error.
		The source code DryRun.java and the DryRun.dat need to be in the same folder. 
	*/
	public static void main (String[] args) throws IOException
	{
		// the Scanner object in is the connection to the DryRun.dat text file.
		Scanner in = new Scanner(new File("DryRun.dat"));
		
		/* 
			the integer variable c will store the count of many names will be read from the file.
			the nextInt method reads in integers
			the nextDouble method reads in doubles
			the nextLine method reads in an entire line as a String
			the next method reads in part of a line as a String.  next method will stop at spaces, tabs, and end of line characters
		*/
		int c = in.nextInt();
		
		// when you call the nextInt or nextDouble, you need to clear the buffer of the end of line character
		in.nextLine();
		
		// this for loop will run integer variable c number of times
		for(int i = 1; i <= c; i++)
		{
			// the for loop will print off the name of text using the name read in from the user.
			System.out.println ("Thank You, " + in.nextLine() + "!");
		}
	}
}