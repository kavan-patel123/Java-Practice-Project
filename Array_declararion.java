import java.util.Scanner;

public class Array_declararion
{
    public static void main (String [] args)
    {
            Scanner sc =new Scanner(System.in);

            System.out.println("enter size of array : ");
            int size=sc.nextInt();

            int sum=0;
            int count=0;

            int a[]=new int[size];

            for(int i=0;i<a.length;i++){
            // { sum=sum+a[i]
                a[i]=sc.nextInt();
                System.out.println("array is " +a[i]);
                sum=sum+a[i];
                count++;
                // System.out.println("sum is this aaray : "+sum);
            }
            System.out.println("sum is this aaray : "+sum);
            System.out.println("sum cout is :"+count);
        
            // System.out.println("array is " +a[i]);


    }
}