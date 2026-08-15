

import java.util.*;

public class Palindrome_Number
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number : ");
        int n =sc.nextInt();

        int orignal=n;
        int digit=0;
        int rev=0;
        
        while(n>0)
        {
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }

        if(orignal==rev)
        {
            System.out.println("this is palindrom number");
        }
        else
        {

              System.out.println("this is no palindrom number");

        }

                

        }


    }

