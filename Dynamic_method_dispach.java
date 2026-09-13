
class Cricket_team{

    public void disp()
    {
        System.out.println("this is CRicket team ....");
    }
}

class T_ind extends Cricket_team{

    public void disp()
    {
        System.out.println("team india ...");
    }
}

class T_aus extends Cricket_team{

    public void disp()
    {
        System.out.println("team aus ...");
    }
}



public class  Dynamic_method_dispach
{
    public static void main(String [] args)

    {

        Cricket_team c1 = new Cricket_team();
        T_ind t1=new T_ind();
        T_aus a1=new T_aus();

        Cricket_team ct;

        ct=c1;
        ct.disp();

        ct=t1;
        ct.disp();

        ct=a1;
        ct.disp();


    }
}