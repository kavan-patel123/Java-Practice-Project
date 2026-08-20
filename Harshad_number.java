
//HARSHAD NUMBER N=18 SUM OF THIS NUMBER 9  18%9==0 THAT IS HARSHAD NUMBER

import java.util.*;
public class Harshad_number
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter two or three digit number : ");
        int n=sc.nextInt();

        int temp=n;
        int sum=0;

        while(n>0)
        {
            int dig=n%10;
            sum=sum+dig;
            n=n/10;

        }
        System.out.println("sum of this number : "+sum);

        if(temp%sum==0)
        {
            System.out.println("this number is harshad number ...");
        }
        else{
            System.out.println("not hrshad number....");
        }
    }
}