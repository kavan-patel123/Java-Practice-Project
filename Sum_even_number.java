import java.util.*;

public class Sum_even_number
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter one number ");
        int n =sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)  //odd no: if(i%2!=0)
            {
                System.out.println("even number is = "+i);
                sum = sum + i;
            }
            
        }
        System.out.println("sum is = "+sum);
    }
}