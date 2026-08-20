//  spy is  2+2==2*2  THAT IS SPY
import java.util.*;

public class Spy_number
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter number (2 or 3 digit)  :  ");
        int n =sc.nextInt();

        int mu=1;
        int sum=0;
        // int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum=sum+digit;
            mu=mu*digit;
            n=n/10;
        }

        System.out.println("sum of this number : "+sum);
        System.out.println("mul of this number : "+mu);

        if(sum==mu)
        {
            System.out.println("this number is spy.....");
        }
        else{
            System.out.println("this number is not spy....");
        }

    }
}