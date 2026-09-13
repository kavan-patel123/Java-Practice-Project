import java.util.*;

class Add{

    int A;
    int B;

    public void getvalue(int A , int B)
    {
        this.A=A;
        this.B=B;
    }

    public void calcullate()
    {
        int c ;
        c = A + B;
        System.out.println("sum  :  "+c);
    }

}

public class Addition_tw
{

    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);

            Add a1=new Add();  //create clss object using new keyword

            System.out.println("enter A value : ");  //user A  input
            int a =sc.nextInt();

            System.out.println("enter B value : ");  //user B input
            int b =sc.nextInt();

            // method calling
            a1.getvalue(a, b);
            a1.calcullate();
    }
}