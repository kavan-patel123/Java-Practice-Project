
import java .util.*;
class Revrece_number{
    public static void main(String [] args)
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter one number (0-30) : ");
        int n =sc.nextInt();

            int count=0;
        for(int i=n;i>=1;i--)
        {
            System.out.println("reverce number is :  " +i);
            count++;
        }
        System.out.println("count is this number : "+count);
    }
    
}