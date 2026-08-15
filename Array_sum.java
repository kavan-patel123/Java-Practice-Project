

import java.util.*;

public class Array_sum
{

    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter size of array : ");
        int size=sc.nextInt();

        int [] arr = new int[size];

        int sum=0;

        System.out.println("entr one by one element ");
        
        for(int i=0;i<arr.length;i++)
        {

            arr[i]=sc.nextInt();

            
            sum=sum + arr[i];

            // arr[i]=sc.nextInt();
                // System.out.println(sum);

        }

        System.out.println(sum);


    }
}