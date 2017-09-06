import java.util.*;
import java.io.*;

public class Sort
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Sort.in"));
		int c = in.nextInt();
		String[] list = new String[c];
		in.nextLine();
		for(int i = 0; i <= c - 1; i++)
		{
		list[i] = in.nextLine();
		
		}
		Arrays.sort(list);
		for(int i = 0; i <= c - 1; i++)
		{
			System.out.println(list[i]);
		}
	}
}