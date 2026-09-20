
import java.util.*;

class Number12{

    int a;
    int b;
    int c;


    void userInput(int a,int b,int c)
    {
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        System.out.println("c is : "+c);

        if(a>b && a>c)
        {
            System.out.println("a is biggest number ....");
        }
        else if (b>a && b>c)
        {
            System.out.println("b is biggest number...");
        }
        else{
            System.out.println("c is biggest");
        }
    }
}

public class Largest_numer_find12{
    public static void main(String [] args)
    {


        Scanner sc=new Scanner(System.in);

        Number12 n1=new Number12();


        System.out.println("enter a : ");
        int a1=sc.nextInt();

        System.out.println("enter b : ");
        int b1=sc.nextInt();

        System.out.println("enter c : ");
        int c1=sc.nextInt();


        //Number12 n1=new Number12();
        n1.userInput(a1,b1,c1);
    }
}