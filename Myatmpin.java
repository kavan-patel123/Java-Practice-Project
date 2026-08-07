
class Myprogram
{
static  int acc_no=45678;
    
    static class Atm
    {
        int pin;
    
    
    void setpin(int pin)
    {
        this.pin=pin;
    }
    void getpin()
    {
        System.out.println("pin is :"+pin);
        System.out.println("bals is :"+acc_no);
    }
    }
}

public class Myatmpin
{
    public static void main(String [] args)
    {
        Myprogram p1 = new  Myprogram();

        // Myprogram .Atm a1= p1.new Atm();

        Myprogram m1 = new Myprogram();

        Myprogram.Atm a1= new Myprogram.Atm();

        a1.setpin(1234);
        a1.getpin();
        
    }
}