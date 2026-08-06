import java.util.*;

class Factorfind
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);


        System.out.println("enter one number = ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("factor is =" +i);
            }
        }
            sc.close();
    }
}