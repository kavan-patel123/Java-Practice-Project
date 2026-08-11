

import java.util.*;

class Find_Square_Root{
    public static void main(String [] args)
    {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter one number : ");
        int n =sc.nextInt();

        if(n>0)
        {
            Double sq = Math.sqrt(n);
            System.out.println(sq);
        }
        else
        {
            System.out.println("NOT VALID 😡");
        }
    }
}