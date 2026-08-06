import java.util.*;

class Fibonacci
{
    void fibosum(int count)
    {

        int a=0;
        int b=1;
        int c;

	System.out.print(a + " " + b);
        
        for(int i =2;i<count;i++)
        {
            c=a+b;
            
		System.out.println(""+c);

            a=b;
            b=c;
        }
        System.out.println();
    }
}

class Fibonacciserise
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Fibonacci fe=new Fibonacci();

        System.out.println("enter number : ");
        int i1 =sc.nextInt();

        fe.fibosum(i1);
    }
}