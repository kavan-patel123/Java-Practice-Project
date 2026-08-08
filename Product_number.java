import java.util.*;

public class Product_number
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter one number ");
        int n =sc.nextInt();

    
        int num = 1;

        for(int i=1;i<=n;i++)
        {
            System.out.println("number is : "+i);
    
        num = num*i;
        }
            System.out.println("product number is "+num);
    
    }
}