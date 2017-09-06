/**
 * @(#)Print.java
 *
 *
 * @author 
 * @version 1.00 2017/9/6
 */

	import java.io.*; 
	import java.util.*;
	
public class Print {
	
        
    /**
     * Creates a new instance of <code>Print</code>.
     */
    public Print() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner in = new Scanner(new File("Print.in"));
        int c = in.nextInt();
        
        for (int i = 0; i < c-1; i++) {
        	System.out.println(in.nextLine());
        }
    }
}
