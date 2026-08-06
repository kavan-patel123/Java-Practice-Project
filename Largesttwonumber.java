import java.util.Scanner;
class Largest
{
    void largestno(int a ,int b)
    {

        if(a>b)
        {
            System.out.println("a is largest");
        }
        else
        {
            System.out.println("b is largest");
        }
    }
}

class Largesttwonumber{
    public static void main(String [] args)
    {

        Scanner sc =new Scanner(System.in);

        Largest ls = new Largest();

        System.out.println("a  is =");
        int i1 =sc.nextInt();

        System.out.println("b  is =");
        int i2 =sc.nextInt();
        
        ls.largestno(i1,i2);

    }
}