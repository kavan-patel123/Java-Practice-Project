import java.util.*;

public class Sumofdigit
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter number  -  ");
        int n=sc.nextInt();

        int sum=0;
        int digit=0;
        int  count=0;

        while(n>0)
        {
            digit=n%10;
            sum=sum+digit;
            n=n/10;
            count++;
        }

        System.out.println("sum of digit ="+sum);
        System.out.println("count of "+count);
        sc.close();
    }
}