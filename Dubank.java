
class Mybank12
{
    int a_no;
    private double balance;
    static  double ir;
    void getirate()
    {
        System.out.println("irate is :"+ir);
    }
}

public class Dubank
{
    static
    {
        System.out.println("this is sttaic block....");
        Mybank12.ir=5.6;
    }
    public static void main(String [] args)
    {
        Mybank12 b1 = new Mybank12();

        b1.getirate();
    }
}