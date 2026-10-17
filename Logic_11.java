
//Leap year or not 
import java.util.*;
public class Logic_11
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year (ex.2025)  :  ");
        int year=sc.nextInt();

        if(year%4==0 || year%100==0 || (year%400==0))
        {
            System.out.println(year+ ": Leap year");
        }
        else{
            System.out.println("Not leapyear");
        }
    }
}