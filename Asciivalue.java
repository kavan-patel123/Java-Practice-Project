

import java.util.Scanner;

public class Asciivalue
{

    // int n;


    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        // int n;

    while(true){

        System.out.println("enter one char : ");
        char c  = sc.next().charAt(0);

        // System.out.println(n);
        
        int ascii = (int) c;

        System.out.println("ASCII IS THIS CHAR = "+ascii);

    
        
    }
    }
}