import java.util.*;
import java.io.*;

public class Add
{
	public static void main(String[] args) throws IOException
	{
		Scanner add = new Scanner(new File("Add.in"));
		double c = add.nextInt();
		while(add.hasNextLine())
		{
			c = c+add.nextInt();
		}
		System.out.println(c);
	}
}