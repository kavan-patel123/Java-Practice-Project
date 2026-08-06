import java.util.*;

 public class Userinput
{
    public static void main(String args [])
    {

        int num1 = Integer.parseInt(args[0]);
        int num2=  Integer.parseInt(args[1]);

        int sum=num1+num2;

        System.out.println("sum of this no"+sum);

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num =");
        int a=sc.nextInt();

        
        System.out.println("enter b num =");
        int b=sc.nextInt();

        int summ=a+b;
        System.out.println("sum is = "+summ);

        sc.close();

    }
}