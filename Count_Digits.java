
//

import java.util.*;

public class Count_Digits
{
    public static void main(String args [])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter digit (EX: 2356)  : ");
        int n =sc.nextInt();

        // int num=1;
        int digit=0;
        int count=0;

        while(n>0)
        {
            digit=n%10;
            // num=digit+n;
            n=n/10;

            count++;
            // System.out.println(count);
            
        }
            System.out.println(count);
    }
}