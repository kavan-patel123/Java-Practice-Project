import java.util.Scanner;
class Largefind
{
    void largest()
    {

        int a ;
	int b;
	int c;

        if(a>b && a>c)
        {
            System.out.println("a is largest");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is largest");
        }
        else
        {
            System.out.println("c is largest");
        }
    }
}

class Largestthreenumber{
    public static void main(String [] args)
    {

        Scanner sc =new Scanner(System.in);

        Largefind st = new Largefind();

        System.out.println("a  is =");
        int i1 =sc.nextInt();

        System.out.println("b  is =");
        int i2 =sc.nextInt();

         System.out.println("c  is =");
        int i3 =sc.nextInt();
        
        st.largest(i1,i2,i3);

    }
}