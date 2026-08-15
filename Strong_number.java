
import java.util.*;

public class Strong_number{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter one number : ");
        int n = sc.nextInt();

        int orignal=n;
        int sum =0;

        while(n>0)
        {
            int digit = n%10;

            int fac=1;
            for(int i=1;i<=digit;i++){
                fac=fac*i;
            }

            sum=sum+fac;
            n=n/10;
        }

        if(orignal==sum)
        {
            System.out.println("this number is Strong ... ");
        }
        else{
            System.out.println("not strong number ...");
        }
    }
}