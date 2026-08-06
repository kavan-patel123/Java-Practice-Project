import java.util.*;

public class Finalbilling
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Bill b2 = new Bill();

        System.out.println("enter n1 product price  : " );
        int i1 = sc.nextInt();
        System.out.println("enter n2 product price  :" );
        int i2 = sc.nextInt();

        b2.findbill(i1, i2);
    }
}

class Bill
{   
    public void findbill(int n1 , int n2 )
    {
        double bill;
        double finalbill;

        System.out.println(n1);
        System.out.println(n2);

        bill = n1 + n2;
        System.out.println("total bill is :" + bill);

        if(bill >= 5000)
        {
            // (bill - 0.20) NAY... (bill * 0.20) AAVSE
            finalbill = (bill - (bill * 0.20)) * 1.05; 
        }
        else if(bill >= 3000)
        {
            // (bill - 0.10) NAY... (bill * 0.10) AAVSE
            finalbill = (bill - (bill * 0.10)) * 1.05;
        }
        else
        {
            finalbill = bill * 1.05;
        }

        System.out.printf("final bill is : %.2f\n", finalbill);
    }
}