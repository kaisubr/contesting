/**
 * @(#)Add.java
 *
 *
 * @author 
 * @version 1.00 2017/9/6
 */
 
 import java.io.*;
 import java.util.*;

public class Add {
        
    /**
     * Creates a new instance of <code>Add</code>.
     */
    public Add() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner in = new Scanner(new File("Add.in"));
        boolean newLines = true;
        double sum = 0;
        
        while (in.hasNextDouble()){
        	sum += in.nextDouble();
        }
        
        System.out.println(sum);
    }
}
