import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter t");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
        	System.out.println("Enter a");
            int a = in.nextInt();
            System.out.println("Enter b");
            int b = in.nextInt();
            System.out.println("Enter n");
            int n = in.nextInt();
            int calc = a;
            for(int j=0;j<n;j++)
            {
                calc+=(Math.pow(2,j)*b);
                
                System.out.print(calc+" ");
                System.out.print("-");
            }
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
        in.close();
    }
}