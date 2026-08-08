
import java.util.Scanner;

public class Numberchack
{

    // int n;


    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        // int n;

    
        System.out.println("enter one number pls");
        int n = sc.nextInt();

        // System.out.println(n);
        

        if(n>=1)
        {
            System.out.println("this number is positive");
        }
        else if(n==0)
        {
            System.out.println("this number is zero");

        }
        else
        {
            System.out.println("this number is negetive");
        }
        
        
    }
}