

import java.io.*;
import java.util.Scanner;

class ARRAY {
    public static void main (String[] args) {
      
    	Scanner  input = new Scanner(System.in);
		 String str = "My name is sujal n";
	     char c =str.charAt(3);
	     System.out.println(c);
	     int d =str.length();
	    
	     System.out.println(d);
	     
	     System.out.println(str.substring(2,7));
	     System.out.println(str.substring(2));
	     
	     String s1 ="name";
	     String s2 ="NAme";
	     System.out.println(str.contains("name"));
	     System.out.println(str.contains("NAME"));
	     System.out.println(s1.equalsIgnoreCase(s2));
	     
	     System.out.println(str.indexOf("name"));
	     System.out.println(str.indexOf('n'));
	     System.out.println(str.indexOf('s',9));
	     
	       char y ='z';
	     char z ='A';
	     
         System.out.println(y-z);	 
         
         int count[] = new int[57];
         
         System.out.println(count.length);
	     
    }
}