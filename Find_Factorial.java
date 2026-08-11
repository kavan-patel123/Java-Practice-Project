

import java .util.*;
class Find_Factorial{
    public static void main(String [] args)
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter one number (0-30) : ");
        int n =sc.nextInt();

            int fact=1;

            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
                // System.out.println(" Factorial :  "+fact); // show this all factorial
            }
            System.out.println(" Factorial :  "+fact);
    }
    
}