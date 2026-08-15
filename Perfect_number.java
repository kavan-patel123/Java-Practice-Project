//find perfect number  6 na factor 1,2,3,  6 == 6  perfect 
import java.util.*;
public class Perfect_number{
    public static void main(String [] args)
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER ONE NUMBER : ");
        int n =sc.nextInt();

        int sum=0;
        // int fact=0;

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                int fact=i;
                sum=sum+i;
                System.out.println(" this number : "+sum);
                // sum=sum+i;
            }
            // sum=sum+i;
        }
        // sum=sum+i;

    

        if(sum==n)
        {
            System.out.println("  this   "   +   n    +   "is perfect.....");
        }
        else{
            System.out.println("this number is not perfect....😒");
        }


    }
}