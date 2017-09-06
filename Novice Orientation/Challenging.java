/**
 * @(#)Challenging.java
 *
 *
 * @author 
 * @version 1.00 2017/9/6
 */


 import java.io.*;
 import java.util.*;
 
public class Challenging {
        
    /**
     * Creates a new instance of <code>Challenging</code>.
     */
    public Challenging() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner in = new Scanner(new File("Challenging.in"));
        
        int sum = 0;
        String line = in.nextLine();
        
        while (in.hasNextLine()) {
        	if (line.equals(in.nextLine())){
        		sum++;
        	}
        }
        
        System.out.println(sum - 1);
        
    }
}
