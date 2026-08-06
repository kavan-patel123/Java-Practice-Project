import java.util.*;

class Totalevenoddfind
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no ");
        int num=sc.nextInt();

        int digit=0;
        int evencount=0;
        int oddcount=0;

        while(num>0)
        {
            digit=num%10;
            if(digit%2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }

            num=num/10;
        }

        System.out.println("evrn no is  "+evencount);
        System.out.println("odd no is   "+oddcount);
    }
}