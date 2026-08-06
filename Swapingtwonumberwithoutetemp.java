import java.util.Scanner;
class Swaptwonumber
{
    void swaper(int a ,int b)
    {

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}

class Swapingtwonumberwithoutetemp{
    public static void main(String [] args)
    {

        Scanner sc =new Scanner(System.in);

        Swaptwonumber st = new Swaptwonumber();

        System.out.println("a  is =");
        int i1 =sc.nextInt();

        System.out.println("b  is =");
        int i2 =sc.nextInt();
        
        st.swaper(i1,i2);

    }
}