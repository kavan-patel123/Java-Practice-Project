import java.util.*;

public class Multiplication_Table
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter one number ");
        int n =sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            int m = n*i;
            System.out.println(n + "x" + i + "=" + m );
        }
    }
}