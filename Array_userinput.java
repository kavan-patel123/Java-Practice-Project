
import java.util.*;

public class Array_userinput{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
         System.err.println("enter size : ");
        int size = sc.nextInt();

        // System.err.println("enter size : ");
        int [] arr = new int [size];

    
        System.out.println("enter one by one value pls : ");

        for(int i=0 ; i<size ; i++)
        {
            arr[i]=sc.nextInt();
            // System.out.println("enter one by one value pls : ");
            System.err.println("array elemnt is : "+arr[i]);
        }
    }
}