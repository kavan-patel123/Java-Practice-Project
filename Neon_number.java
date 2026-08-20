


import java.util.*;

public class Neon_number
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number : ");
        int n =sc.nextInt();



            
        int temp=n;
            int sum=0;
            int p=n*n;
            int z=p;
            System.out.println(z);

            while(z>0)
            {
            int digit=0;
            digit =z%10;
            sum=sum+digit;
            z=z/10;
            }

            if(temp==sum)
            {
                System.out.println("this number is neyon number");
            }
            else{
                System.out.println("this number is not neyon number");
            }
        

    

    }

}