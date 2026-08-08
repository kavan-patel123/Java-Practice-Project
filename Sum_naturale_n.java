import java.util.*;

public class Sum_naturale_n
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter one number ");
        int n =sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum =sum + i;
            System.out.println(i);

        // System.out.println("sum of n number  =  "+sum);
        }
        System.out.println("sum of number = "+sum);
    }
}