
import my_package.Test1;


public class Main16 extends Test1{
    public static void main(String []args)
    {

        Main16 t1=new Main16();
        System.out.println(t1.public_var);
        System.out.println(t1.protected_var);
        //System.out.println(t1.display);
        t1.display();
        //System.out.println(t1.default_var);
    }
}