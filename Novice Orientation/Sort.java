/**
 * @(#)Sort.java
 *
 *
 * @author 
 * @version 1.00 2017/9/6
 */

 import java.io.*;
 import java.util.*;
 
public class Sort {
        
    /**
     * Creates a new instance of <code>Sort</code>.
     */
    public Sort() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner in = new Scanner(new File("Sort.in"));
        
        int amount = Integer.valueOf(in.nextLine());
        String[] x = new String[amount-1];
        
        for (int i = 0; i < x.length; i++) {
        	x[i] = in.nextLine();
        }
        
        Arrays.sort(x);
        
        for (int i = 0; i < x.length; i++) {
        	System.out.println(x[i]);
        }
    }
}
